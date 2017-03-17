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
#include "c:\Users\Destiny\Documents\Cereal\tinyxml\tinyxml.h"
#include <iostream>
#include <istream>
#include <string>
#include <vector>



using namespace std;

#define RETURNNAME(name) returnname(#name, (name))
#define RETURNVALUE(name) returnvalue(#name, (name))

template<class T>
string returnname(const char * name, const T& val) {
		return name;
}

template<class T>
string returnvalue(const char * name, const T& val) {
	return name;
}

#ifndef templatexml_h
#define templatexml_h

template<class ... Object>
class templateXML {
	
	public:

	TiXmlDocument doc;


	templateXML(void);
	~templateXML(void);

	void operator()(Object ... object);
	bool process(int index);
	void saveFile(FILE* saveFile);

	private:

	vector<Object...> inputs;
	int count = 0;

};

#endif // !templatexml_h

template<class...Object>
templateXML<Object...>::templateXML(void) {

	TiXmlDeclaration* declaration = new TiXmlDeclaration("1.0", "", "");
	doc.LinkEndChild(declaration);

}

template<class ...Object>
inline templateXML<Object...>::~templateXML(void) {

}

template<class... Object>
inline void templateXML<Object...>::operator()(Object ... object) {
	inputs = { object... };
	for (int index = 0; index < inputs.size(); index++) {
		process(index);
	}

}

template<class...Object>
bool templateXML<Object...>::process(int index) {

	string name = RETURNNAME(inputs[index]);
	string value = RETURNVALUE(inputs[index]);

	if (count == 0) {
		TiXmlElement* root = new TiXmlElement(name);
		doc.LinkEndChild(root);
		count++;
	} else {

		TiXmlElement* element = new TiXmlElement(name);
		doc.LinkEndChild(element);

		TiXmlText* text = new TiXmlText(value);
		element->LinkEndChild(text);
	}
	
	return true;
}

template<class ...Object>
void templateXML<Object...>::saveFile(FILE* saveFile) {
	doc.SaveFile(saveFile);
}
