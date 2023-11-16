package com.cledilsondevcode.gof.singleton;

/**
 * A classe SingletonLazyHolder implementa o padrão de design Singleton utilizando a técnica
 * Lazy Holder para garantir a criação preguiçosa (lazy instantiation) da instância única.
 * Isso significa que a instância é criada apenas quando necessário, proporcionando eficiência
 * na inicialização.
 *
 * Exemplo de uso:
 * {@code
 * SingletonLazyHolder singleton = SingletonLazyHolder.getInstance();
 * }
 *
 * <p>Esta implementação do Singleton é thread-safe devido à inicialização tardia da instância
 * na classe interna estática.</p>
 *
 * <p>Esta classe utiliza uma classe interna estática (InstanceHolder) para conter a única
 * instância do Singleton. A instância é criada durante a inicialização da classe interna,
 * garantindo que a criação ocorra de maneira segura em ambientes multithread.</p>
 *
 * <p>A classe SingletonLazyHolder não pode ser instanciada diretamente fora desta classe
 * e fornece um método estático ({@code getInstance()}) para obter a instância única.</p>
 *
 * Exemplo de uso:
 * {@code
 * SingletonLazyHolder singleton = SingletonLazyHolder.getInstance();
 * }
 *
 * <p>Essa implementação do Singleton é eficiente e segura para uso em ambientes concorrentes.</p>
 *
 * @author cledilson-devcode
 * @version 1.0
 */
public class SingletonLazyHolder {

    /**
     * Classe interna estática (InstanceHolder) que contém a instância única do Singleton.
     */
    private static class InstanceHolder {
        /**
         * A instância única do Singleton, inicializada durante a carga da classe interna.
         */
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    /**
     * Construtor privado para evitar a instanciação direta da classe fora desta classe.
     */
    private SingletonLazyHolder() {
        super();
    }

    /**
     * Método estático que fornece a instância única do Singleton. A instância é criada
     * apenas quando este método é chamado pela primeira vez.
     *
     * @return A instância única do Singleton.
     */
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}
