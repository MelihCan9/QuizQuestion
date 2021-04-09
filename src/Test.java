public class Test {

        public static void main(String[] args){

              ElectricGuitar guitar = new ElectricGuitar();

                Violin violin = new Violin();

                guitar.play();

                violin.play();

                guitar = new ElectricGuitar(7);

                violin = new Violin(3);

                guitar.play();

                violin.play();


        }
}
