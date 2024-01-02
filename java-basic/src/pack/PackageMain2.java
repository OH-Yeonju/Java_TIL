package pack;

import pack.a.*; // 여러개 가져올때
public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new pack.a.User();
        User2 user2 = new pack.a.User2();
    }
}
