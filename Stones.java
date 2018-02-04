class Stones {

    public int numJewelsInStones(String J, String S) {

        int countOfStones = 0;
        for(char letters: J){
            for(char stones:S){
                if (letters.equals(stones)){
                    countOfStones++;
                }
            }
        }
        return countOfStones;
    }

    public static void main(String[] args){
        String J="aBC";
        String S="aaBBccC";
        System.out.println(numJewelsInStones(J, S));

    }
}