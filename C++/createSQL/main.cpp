#include<iostream>
#include<fstream>
using namespace std;
void insertdata();
void createtable();
int main()
{
	cout << "1. ���̺����" << endl;
	cout << "2. ���̺� ������ �ֱ�" << endl <<endl;
	cout << "����� ��� ��ȣ�� �Է� : ";
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
	cout << "�����Ͱ� �� ���̺� �̸�(����Ŭ�� �Էµ�) �Է� ( ex) member ) : ";
	cin >> tablename;
	string dataname;
	cout << "���������� �̸� �Է� ( ex) member_data ) : ";
	cin >> dataname;
	int countcul;
	int countdata;
	cout << "�÷�����, �����Ͱ����� �Է� (����� ����) : ";
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
	cout << "����Ŭ�� �Էµ� ���̺��̸� �Է� ( ex) member ) : ";
	cin >> tablename;
	string dataname;
	cout << "���̺������� ����ִ� ���� �̸� �Է� ( ex) member_table ) : ";
	cin >> dataname;
	int countcul;
	int countdata;
	cout << "���̺� �� �÷������� �Է� : ";
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
	cout << "primary key �ɼ��� �� �÷���ȣ�� �Է� : ";
	cin >> primary;

	int nullcount;

	cout << "not null �ɼ��� �� �÷� ������ �Է�(primary�ɼ��� �� �÷��� ����) : ";
	cin >> nullcount;

	int* nullcul = new int[nullcount];
	bool* nullck = new bool[countcul];
	for (int i = 0; i < countcul; i++)
		nullck[i] = false;

	cout << "not null �ɼ��� �� �÷���ȣ���� �Է� (����� ����): ";
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
