Minimum Flip To Convert A Number

class flipBit {
    public static void main(String[] args) {
        int n = 10;
        int goal = 7;
        int ans = n^goal;
        int count = 0;
        while(ans>0){
            count += ans&1;
            ans= ans>>1;
        }
        System.out.print(count);
    }
}
