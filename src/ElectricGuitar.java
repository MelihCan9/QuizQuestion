public class ElectricGuitar extends StringedInstrument {


        public ElectricGuitar(){

                numberOfStrings = 4;
                name = "Electric Guitar";
        }

        public ElectricGuitar(int numberOfStrings){

                super(numberOfStrings);
                name = "Electric Guitar";
        }

        @Override
        public void play(){

                System.out.println(numberOfStrings + " Stringed " + this.name + " is playing...");
        }


}
