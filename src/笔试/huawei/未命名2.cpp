#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
using ll = long long;

// 求两个整数的最大值
int Max(int a, int b) {
    if(a > b) return a;
    else return b;
}

// 多项式相加
vector<int> addPlo(const vector<int>& A, const vector<int>& B) {
    int sizeA = A.size();
    int sizeB = B.size();
    int max_size = Max(sizeA, sizeB);
    // 初始化结果向量
    vector<int> result(max_size);
    // 遍历A，将对应位置的系数相加
    for (int i = 0; i < sizeA; i++) {
        result[i] += A[i];
    }
    // 遍历B，将对应位置的系数相加
    for (int i = 0; i < sizeB; i++) {
        result[i] += B[i];
    }

    return result;
}

// 多项式相减
vector<int> subPlo(const vector<int>& A, const vector<int>& B) {
    int sizeA = A.size();
    int sizeB = B.size();
    int max_size = Max(sizeA, sizeB);

    // 初始化结果向量
    vector<int> result(max_size);
    // 遍历A，将对应位置的系数相加
    for (int i = 0; i < sizeA; i++) {
        result[i] += A[i];
    }
    // 遍历B，将对应位置的系数相减
    for (int i = 0; i < sizeB; i++) {
        result[i] -= B[i];
    }

    return result;
}

// 多项式相乘
vector<int> mulPlo(const vector<int>& A, const vector<int>& B) {
    int sizeA = A.size();
    int sizeB = B.size();
    int max_size = sizeA + sizeB - 1;

    // 初始化结果向量
    vector<int> result(max_size);
    // 通过嵌套循环计算相应位置的系数乘积
    for (int i = sizeA - 1; i >= 0; i--) {
        for (int j = sizeB - 1; j >= 0; j--) {
            result[i + j] += A[i] * B[j];
        }
    }

    return result;
}

int main() {
    vector<int> A, B;
    char op;
    int coe;
    string inputA, inputB;
    // 读取输入的两个多项式字符串
    getline(cin, inputA);
    getline(cin, inputB);
    // 去掉字符串两端的括号
    inputA = inputA.substr(1, inputA.size() - 2);
    inputB = inputB.substr(1, inputB.size() - 2);
    // 将字符串转换为整数数组
    for (char c : inputA) {
        if (c != ' ') {
            A.push_back(c - '0'); // 将字符转换为整数
        }
    }
    for (char c : inputB) {
        if (c != ' ') {
            B.push_back(c - '0'); // 将字符转换为整数
        }
    }
    // 根据操作符执行相应的多项式操作
    vector<int> result;
    cin >> op;
    switch (op) {
        case '+':
            result = addPlo(A, B);
            break;
        case '-':
            result = subPlo(A, B);
            break;
        case '*':
            result = mulPlo(A, B);
            break;
        default:
            break;
    }
    // 输出结果多项式
    int size = result.size();
    bool mark = true;
    for (int i = size - 1; i >= 0; i--) {
        if (result[i] != 0) {
            if (!mark) {
                cout << " ";
            }
            cout << result[i];
            mark = false;
        }
    }
    cout << "\n";
    return 0;
}
