package com.cledilsondevcode.gof.singleton;

/**
 * SingletonLazy representa uma implementação preguiçosa do padrão Singleton,
 * adiando a criação da instância até que seja realmente necessária.
 *
 * @author cledilson-devcode
 *
 */

public class SingletonLazy {

    // Criado a declaração para gerar a instancia
    private static SingletonLazy instancia;

    // Criado um construtor privado para não permitir que outros instanciem essa classe
    private SingletonLazy() {
        super();
    }

    /**
     *  Retorna uma instância única da classe SingletonLazy.
     *  Se a instancia ainda não foi criada, uma nova instância é criada e retornada
     *
     * @return A instância única de SingletonLazy
     */
    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
