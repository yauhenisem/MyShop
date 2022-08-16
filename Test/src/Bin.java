public class Bin<T> {
    public static void main(String[] args) {
        System.out.println(name(44,"Amd"));


        }
        public static <T1, T2 > int name(T1 num1, T2 num2){
            return num1.hashCode()+111111+ num2.hashCode();
    }
}
