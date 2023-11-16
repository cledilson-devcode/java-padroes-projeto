import com.cledilsondevcode.gof.singleton.SingletonEager;
import com.cledilsondevcode.gof.singleton.SingletonLazy;
import com.cledilsondevcode.gof.singleton.SingletonLazyHolder;
import com.cledilsondevcode.gof.strategy.*;

public class Teste {
    public static void main(String[] args) {
        // Testando Singleton
//        SingletonLazy lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstance();
//        System.out.println(eager);
//        eager = SingletonEager.getInstance();
//        System.out.println(eager);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);

        // Testando Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

    }
}