package com.cledilsondevcode.gof.singleton;

/**
 *
 * SingletonEager representa uma implementação apressada do padrão Singleton,
 * criando a instancia assim que acionada
 *
 * Exemplo de uso:
 * {@code
 *     SingletonEarger instanciaUnica = SingletonEager.getInstancia();
 * }
 *  Nota: Este padrão garante que apenas uma instância da classe será criada durante toda a execução do programa
 *
 *
 * @author cledilson-devcode
 * @version 1.0
 */

public class SingletonEager {

    /**
     * Cria a instância única assim que a classe é chamada
     */
    private static SingletonEager instancia = new SingletonEager();

    /**
     * Crontrutor private evita a criação de instâncias adicionais da classe.
     */
    private SingletonEager() {
        super();
    }

    /**
     * Obtém a instância única da classe SingletonEager
     * @return A instância única da classe.
     */
    public static SingletonEager getInstance(){
        return instancia;
    }
}
