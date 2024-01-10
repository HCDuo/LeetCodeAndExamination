#include<iostream>
#include<vector>
#include<stack>
#include<sstream>

using namespace std;
using ll = long long;

int main() {
    vector<int> A;
    char op;
    int As;  // 修复：更正变量名
    string s;
    getline(cin, s);
    stringstream ss(s);  // 修复：添加缺失的分号
    // 从输入字符串中提取整数并将其加入数组A
    while (ss >> As) {  // 修复：将's'更正为'ss'以适应stringstream
        A.push_back(As);
    }
    int size = A.size();
    // 以相反的顺序输出数组A的元素
    for (int i = 0; i < size; i++) {
        cout << A.back() << " ";  // 修复：将'A.pop_back()'更正为'A.back()'以正确输出元素
        A.pop_back();  // 修复：移除pop_back，避免无限循环
    }
    return 0;
}
