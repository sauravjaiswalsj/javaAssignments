#include<iostream>
using std::cout;
using std::string;
class Cat{
	public: string name;
};
Cat* callBar(Cat *cat){
	cout<<&cat<<"\n";
	cat = new Cat();
	cout<<&cat<<"\n";
	cout<<*(&cat)<<"\n";	
	return cat;
}
int main(void){
	Cat *c = new Cat();
	cout<<&c<<"\n";
	cout<<callBar(c)<<"\n";
	cout<<*(&c)<<"\n";
	return 0;
}

