/*-------------------------------------------------------------------------------------------------

	Author:				Boyer, Destiny
	Version:			1.0
	Date Created:		06 March 2017
	Last Modified:		16 March 2017

		This is a template class that will take in a variable and return
	a name-value-pair. The name is the class name of the variable and the
	value is the variable's initialized value.

-------------------------------------------------------------------------------------------------*/

#pragma once
#include <iostream>
#include <istream>
#include <string>
#include <cstdarg>
#include <sstream>
#include <typeinfo>
#include "tinyxml\tinyxml.h"
using namespace std;			

namespace toXML {

	#define TOXML_SERIALIZE()
	#define NAME_VALUE_PAIR(T) make_nvp(#T, (T))

	/*------------------------------------------------------------------------------------------------

		struct to hold a descriptive string name and a corresponding value for each parameter.

	------------------------------------------------------------------------------------------------*/

	template<class Type>
	struct NameValuePair {

		public:
		NameValuePair() : name(""), value() {};
		NameValuePair(char const * n, Type & v) : name(n), value(std::forward<Type>(v)) {}
		string name;
		Type value;

		template<class Archive>
		void toxml(Archive & archive) {
			archive.process(this);
		}
	};

	/*---------------------------------------------------------------------------------------------

		Constructs name value pair for a given parameter.

	---------------------------------------------------------------------------------------------*/

	template <class T>
	NameValuePair<T> make_nvp(std::string const & name, T & value){
		return{ name.c_str(), std::forward<T>(value) };
	}

	/*---------------------------------------------------------------------------------------------

		Constructs name value pair for a given parameter.

	---------------------------------------------------------------------------------------------*/

	template <class T>
	NameValuePair<T> make_nvp(const char * name, T & value) {
		NameValuePair<T> retVal;
		retVal.name = name;
		retVal.value = std::forward<T>(value);
		return retVal;
	}

	template<class Archive, class T> inline
	static auto member_serialize(Archive & ar, T & t) {return t.toxml(ar);}

	#ifndef templatexml_h
	#define templatexml_h

	class templateXML {

		private:

		TiXmlDocument document;
		TiXmlElement* root;
		TiXmlElement* current;

		public:

		/*-----------------------------------------------------------------------------------------

			Constructor. Requires a string to use as the file name for the templateXML object.

		-----------------------------------------------------------------------------------------*/

		templateXML(string docName) {
			TiXmlDeclaration* declaration = new TiXmlDeclaration("1.0", "", "");
			document.LinkEndChild(declaration);

			root = new TiXmlElement("root");
			document.LinkEndChild(root);

		}

		~templateXML(void) {}
		
		/*-----------------------------------------------------------------------------------------

			Processes each object by calling the toxml method that has been defined in that
			object's class.

		-----------------------------------------------------------------------------------------*/

		template <typename T>
		void process(T t) {
			member_serialize(*this, t);
		}

		/*-----------------------------------------------------------------------------------------

			Returns a boolean value indicating whether the parameter is a built-in type. Built-in
			types include all primitives and strings.

		-----------------------------------------------------------------------------------------*/

		template <typename T>
		bool builtInType(T t) {
			bool isCustom = false;
				if (typeid(t.value) == typeid(string)) {
					isCustom = true;
				} else if (isBasicType(t)) {
					isCustom = true;
				}
			return isCustom;
		}

		/*-----------------------------------------------------------------------------------------

			Returns a boolean value indicating whether the parameter is a primitive type.

		-----------------------------------------------------------------------------------------*/

		template<typename T>
		bool isBasicType(T t) {
			bool isBasic = false;
			if (typeid(t.value) == typeid(int) || typeid(t.value) == typeid(char) ||
				typeid(t.value) == typeid(float) || typeid(t.value) == typeid(double) ||
				typeid(t.value) == typeid(short) || typeid(t.value) == typeid(long)) {
				isBasic = true;
			}
			return isBasic;
		}

		/*-----------------------------------------------------------------------------------------

			Unpacks the arugment parameter pack and forwards each parameter to
			process(NameValuePair<T>) to process and append each parameter to the XML file.

		-----------------------------------------------------------------------------------------*/

		template<typename... Args>
		void process(Args &&... args) {
			int dummy[] = { 0, ((void)process(std::forward<Args>(args)), 0) ... };
		}

		/*-----------------------------------------------------------------------------------------

			Appends the name and value of the parameter to the XML file.

		-----------------------------------------------------------------------------------------*/

		template<typename T>
		void process(NameValuePair<T> nvp) {
		
			stringstream convert;
			convert << nvp.value;
			string temp = convert.str();
			
			TiXmlElement* element = new TiXmlElement(nvp.name);
			element->LinkEndChild(new TiXmlText(temp));
			current->LinkEndChild(element);
		
		}

		template<class T>
		void toxml(templateXML& archive, T t) {
		}

		/*-----------------------------------------------------------------------------------------

			Overloaded () operator for toXML objects. Allows templatXML projects to process
			parameter packs. Arguments are forwarded to process() for unpacking and further
			processing.

		-----------------------------------------------------------------------------------------*/


		template<class...Objects>
		void operator()(Objects && ... args) {
			process(args...);
		}

		/*-----------------------------------------------------------------------------------------

			Adds a new level to the XMl file by adding a child node to the root node. Uses the
			object's typeid to retrieve the Object's class name. The typeid is trimmed to
			include only the string representation of the object's name for inclusion in the
			XML file. The object's class name will be the name of the new node.

		-----------------------------------------------------------------------------------------*/

		template<class T>
		void addNewLevel(T t) {
			current = root;
			string temp = typeid(t).name();
			int indexes[2];
			int count = 0;
			int index = 0;
			while (index < temp.length()) {
				if (temp[index] == ' ') {
					indexes[count++] = index;
				}
				index++;
			}
			string temptemp = temp.substr(indexes[0] + 1, indexes[1] - indexes[0] - 1);
			TiXmlElement* child = new TiXmlElement(temptemp);
			root->LinkEndChild(child);
			current = root->FirstChildElement();
		}

		/*-----------------------------------------------------------------------------------------

			Saves the built XML file to the given directory. Returns a bool value indicating
			success.

		-----------------------------------------------------------------------------------------*/

		bool saveFile(FILE* saveFile) {
			bool successfulSave = false;
			successfulSave = document.SaveFile(saveFile);
			return successfulSave;
		}
	};
	#endif // !templatexml_h
};


