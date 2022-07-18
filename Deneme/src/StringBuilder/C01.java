package StringBuilder;

public class C01 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java cok guzel");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("sb1 lenght : " + sb1.length()); // 0
        System.out.println("sb1 capasity : " + sb1.capacity()); // 16

        System.out.println("sb2 lenght : " + sb2.length()); // 14
        System.out.println("sb2 capasity : " + sb2.capacity()); // 30

        System.out.println("sb3 lenght : " + sb3.length()); // 0
        System.out.println("sb3 capasity : " + sb3.capacity()); // 10

        // appent ile StringBuilder a ekleme yapilabilir

        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sb1 lenght : " + sb1.length()); // 14
        System.out.println("sb1 capasity : " + sb1.capacity()); // 16

        sb1.append(3);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);

        System.out.println("sb1 lenght : " + sb1.length()); // 19
        System.out.println("sb1 capasity : " + sb1.capacity()); // 34

        sb1.trimToSize(); // bos capasity yi atar
        System.out.println("sb1 lenght : " + sb1.length()); // 19
        System.out.println("sb1 capasity : " + sb1.capacity()); // 19
    }
}
