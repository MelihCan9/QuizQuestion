public class Violin extends StringedInstrument{

        public Violin(){

                numberOfStrings = 6;
                name = "Violin";
        }

        public Violin(int numberOfStrings){

                super(numberOfStrings);
                name= "Violin";
        }

        @Override
        public void play(){

                System.out.println( numberOfStrings+ " Stringed " + name +" is playing...");
        }

}
