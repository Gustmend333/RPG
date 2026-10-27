package entities;

import entities.Classes.*;

public enum ClassesEnum {

    MAGO{
        @Override
        public Classe getClasse() {
            return new Mago();
        }
    },
    BARBARO{
        @Override
        public Classe getClasse() {
            return new Barbaro();
        }
    },
    MONGE{
        @Override
        public Classe getClasse() {
            return new Monge();
        }
    },
    LADINO{
        @Override
        public Classe getClasse() {
            return new Ladino();
        }
    },
    DRUIDA{
        @Override
        public Classe getClasse() {
            return new Druida();
        }
    };

    public abstract Classe getClasse();

}
