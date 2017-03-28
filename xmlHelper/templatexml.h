/*-----------------------------------------------------------------------------

	Author:				Boyer, Destiny
	Version:			1.0
	Date Created:		06 March 2017
	Last Modified:		16 March 2017

		This is a template class that will take in a variable and return
	a name-value-pair. The name is the class name of the variable and the
	value is the variable's initialized value.

-----------------------------------------------------------------------------*/

#pragma once
#include <iostream>
#include <istream>
#include <string>
#include <cstdarg>
#include <sstream>
#include "tinyxml\tinyxml.h"
using namespace std;

namespace toXML {

	#define NAME_VALUE_PAIR(T) make_nvp(#T, (T))

	template<class Type>
	struct NameValuePair {

		public:
		NameValuePair() : name(""), value() {};
		NameValuePair(char const * n, Type & v) : name(n), value(std::forward<T>(v)) {}
		string name;
		Type value;
	};


	template <class T>
	NameValuePair<T> make_nvp(std::string const & name, T & value){
		return{ name.c_str(), std::forward<T>(value) };
	}

	template <class T>
	NameValuePair<T> make_nvp(const char * name, T & value) {
		NameValuePair<T> retVal;
		retVal.name = name;
		retVal.value = std::forward<T>(value);
		return retVal;
	}


	#ifndef templatexml_h
	#define templatexml_h

	class templateXML {

		private:

		TiXmlDocument document;
		TiXmlElement* root;

		public:

		templateXML(string docName) {
			TiXmlDeclaration* declaration = new TiXmlDeclaration("1.0", "", "");
			document.LinkEndChild(declaration);

			root = new TiXmlElement("root");
			document.LinkEndChild(root);

		}

		~templateXML(void) { }

		template <typename T>
		void process(T t) {
			stringstream convert;
			convert << t.value;
			string temp = convert.str();

				TiXmlElement* element = new TiXmlElement(t.name);
				element->LinkEndChild(new TiXmlText(temp));
				root->LinkEndChild(element);

		}
		
		template<typename... Args>
		void process(Args &&... args) {
			int dummy2[] = { 0, ((void)process(std::forward<Args>(args)), 0) ... };
		}

		template<class...Objects>
		void operator()(Objects && ... args) {
			process(args...);
		}

		bool saveFile(FILE* saveFile) {
			bool successfulSave = false;
			successfulSave = document.SaveFile(saveFile);
			return successfulSave;

		}


	};

	#endif // !templatexml_h

}


