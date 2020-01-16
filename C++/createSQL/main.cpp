#include<iostream>
#include<fstream>
using namespace std;
void insertdata();
void createtable();
int main()
{
	cout << "1. 테이블만들기" << endl;
	cout << "2. 테이블에 데이터 넣기" << endl <<endl;
	cout << "사용할 기능 번호를 입력 : ";
	int func;
	cin >> func;

	switch (func)
	{
	case 1: createtable();
		break;
	case 2: insertdata();
		break;
	}
	return 0;
}
void insertdata() {
	string tablename;
	cout << "데이터가 들어갈 테이블 이름(오라클에 입력된) 입력 ( ex) member ) : ";
	cin >> tablename;
	string dataname;
	cout << "데이터파일 이름 입력 ( ex) member_data ) : ";
	cin >> dataname;
	int countcul;
	int countdata;
	cout << "컬럼개수, 데이터개수를 입력 (띄어쓰기로 구분) : ";
	cin >> countcul >> countdata;
	string* cul = new string[countcul];
	ifstream fin;
	fin.open(dataname+".txt", ios::in);
	ofstream fout;
	fout.open(tablename+"_data_create.txt", ios::out);
	fout << "insert all" << endl;
	for (int i = 0; i < countdata; i++) {
		for (int j = 0; j < countcul; j++) {
			fin >> cul[j];
		}

		fout << "into " << tablename << " values (";
		for (int j = 0; j < countcul-1; j++) {
			fout << "'" << cul[j] << "' , ";
		}
		fout << cul[countcul - 1] << ")" << endl;
	}
	fout << "select * from dual;";
}

void createtable() {

	string tablename;
	cout << "오라클에 입력될 테이블이름 입력 ( ex) member ) : ";
	cin >> tablename;
	string dataname;
	cout << "테이블정보가 들어있는 파일 이름 입력 ( ex) member_table ) : ";
	cin >> dataname;
	int countcul;
	int countdata;
	cout << "테이블에 들어갈 컬럼개수를 입력 : ";
	cin >> countcul;

	string** cul = new string*[countcul];
	for (int i = 0; i < countcul; i++)
	{
		cul[i] = new string[2];
	}
	ifstream fin;
	fin.open(dataname + ".txt", ios::in);
	ofstream fout;
	fout.open(tablename + "_table_create.txt", ios::out);

	

	ifstream fin2;
	fin2.open(dataname + ".txt", ios::in);
	

	for (int i = 0; i < countcul; i++)
		fin2 >> cul[i][0] >> cul[i][1];

	for (int i = 0; i < countcul; i++)
		cout << i << " \t" << cul[i][0] << " \t" << cul[i][1] << endl;

	int primary;
	cout << "primary key 옵션을 줄 컬럼번호를 입력 : ";
	cin >> primary;

	int nullcount;

	cout << "not null 옵션을 줄 컬럼 개수를 입력(primary옵션을 준 컬럼은 제외) : ";
	cin >> nullcount;

	int* nullcul = new int[nullcount];
	bool* nullck = new bool[countcul];
	for (int i = 0; i < countcul; i++)
		nullck[i] = false;

	cout << "not null 옵션을 줄 컬럼번호들을 입력 (띄어쓰기로 구분): ";
	for (int i = 0; i < nullcount; i++)
		cin >> nullcul[i];


	fout << "create table " << tablename << " (" << endl;
	for (int i = 0; i < countcul; i++)
	{
		for (int j = 0; j < nullcount; j++) {
			if (nullcul[j] == i) 
				nullck[i] = true;
		}
		if(nullck[i])
			fout << cul[i][0] << " \t" << cul[i][1] << " \t" << "not null," << endl;
		else
			fout << cul[i][0] << " \t" << cul[i][1] << " ," << endl;
		
	}
	fout << "primary key(" << cul[primary][0] << ") \t);" << endl;
	
}
