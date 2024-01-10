#include<iostream>
#include<algorithm>
#include<vector>
#include<set>
using namespace std;
using ll = long long;

int main() {
    // 读取输入：m和n分别表示两个数组的大小，x和y表示两个特定的数值
    int m, n;
    ll x, y;
    cin >> m >> n >> x >> y;
    // 声明两个数组a和b，并读取数组元素
    vector<ll> a(m + 1), b(n + 1);
    for (int i = 1; i <= m; i++) {
        cin >> a[i];
    }
    for (int i = 1; i <= n; i++) {
        cin >> b[i];
    }
    // 对数组a和b进行排序
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    // 初始化变量ans为0，声明一个集合sta
    ll ans = 0;
    set<ll> sta;
    // 使用双指针遍历数组b和a
    for (int i = 1, j = 1; i <= n; i++) {
        // 在数组a中找到满足条件的元素并插入集合sta
        while (j <= m && a[j] <= b[i] + y)
            sta.insert(a[j++]);
        // 判断集合sta是否非空
        if (sta.size()) {
            // 查找集合sta中大于等于a[i]的最小值
            auto it = sta.upper_bound(b[i]);
            // 如果找到，将该值从集合sta中移除，ans加1
            if (it != sta.begin()) {
                it = prev(it);
                sta.erase(it);
                ans++;
            }
            // 如果找不到，并且还有可用的x，查找大于等于a[i]+y的最小值
            else if (x) {
                it = sta.upper_bound(b[i] + y);
                // 如果找到，将该值从集合sta中移除，ans加1，x减1
                if (it != sta.begin()) {
                    it = prev(it);
                    sta.erase(it);
                    ans++;
                    x--;
                }
            }
        }
    }
    // 输出结果
    cout << ans << "\n";
    return 0;
}
