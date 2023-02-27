public class Gato extends Animal implements ComerCarne{
        String sonido = "miau";

        public String setSonido(String miau) {
                return sonido;
        }

        @Override
        public void ComerCarne() {

        }
        @Override
        public void emitirSonido() {
                System.out.println(this.getSonido("miau"));
        }




        @Override
        public void comerCarne() {

        }

        @Override
        public void comerAnimal(Animal animal) {

        }
}
