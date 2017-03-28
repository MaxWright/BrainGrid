#include "templateXML.h"

int main(int argc, char* argv[]) {

	FILE* outFile = fopen("outFile.txt", "w");

	string fileName = "outFile.txt";

	toXML::templateXML iarchive(fileName);

	int a = 0;
	int b = 2;
	int c = 3;

	string myString = "this is a string";

	iarchive(toXML::NAME_VALUE_PAIR(a), toXML::NAME_VALUE_PAIR(b), toXML::NAME_VALUE_PAIR(myString));

	iarchive.saveFile(outFile);

	//myInventory = RETURNVALUE(myInventory);
	//cout << RETURNVALUE(myInventory) << endl;

	return 0;
}