package MProf_27_06.Lambdas;

public class Test95 { // Случай, когда реализация уже написана в другом методе getRef
    public static void main(String[] args) {
        m2(Test95::getRef); // -> ссылка на реализацию
        // обращение к клвссу Test95 :: и к методу getRef
    }
    public static void getRef(){
        System.out.println("***");
        System.out.println("&&&");
    }
    public static void m2 (Term term){
        System.out.println("*****");
        term.get();
    }
}
@FunctionalInterface
interface Term {
    void get();
}
