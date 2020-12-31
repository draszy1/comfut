import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Comput comput = new Comput();

        CompletableFuture.runAsync(() ->comput.calculate());

        Thread.sleep(15000);//nie czeka na rezultat bez spania
        System.out.println("end");
    }
}
