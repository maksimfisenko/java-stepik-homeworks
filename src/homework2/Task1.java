package homework2;

public class Task1 {
    public static void main(String[] args) {

        byte byte10 = 12;
        byte byte2 = 0b1100;
        byte byte8 = 0_14;
        byte byte16 = 0xC;

        System.out.println(byte10 + " " + byte2 + " " + byte8 + " " + byte16);

        short short10 = 1300;
        short short2 = 0b10100010100;
        short short8 = 0_2424;
        short short16 = 0x514;

        System.out.println(short10 + " " + short2 + " " + short8 + " " + short16);

        long long10 = 123456789L;
        long long2 = 0b111010110111100110100010101;
        long long8 = 0_726746425;
        long long16 = 0x75bcd15;

        System.out.println(long10 + " " + long2 + " " + long8 + " " + long16);

    }
}
