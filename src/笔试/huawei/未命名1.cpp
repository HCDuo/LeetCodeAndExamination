#include<iostream>
#include<vector>
#include<stack>
using namespace std;
using ll = long long;
using P = pair<int,int>;

int main() {
    // 读取数组大小n
    int n;
    cin >> n;
    // 声明一个包含long long整数的向量'a'和一个栈'sta'
    vector<ll> a(n+1);
    stack<ll> sta;
    // 将'ans'初始化为0
    ll ans = 0;
    // 遍历数组中的每个元素
    for(int i = 1; i <= n; i++) {
        // 读取输入值并存储在数组'a'中
        cin >> a[i];
        // 当栈非空且栈顶元素大于当前数组元素时，弹出栈中的元素
        while(sta.size() && sta.top() > a[i])
            sta.pop();
        // 如果栈非空，将栈顶元素加到'ans'中
        if(sta.size())
            ans += sta.top();
        // 将当前数组元素推入栈中
        sta.push(a[i]);
    }
    // 打印最终结果
    cout << ans << "\n";
    return 0;
}
