package hashing;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class EVMMachine {

    public static void evmMachine(String voterId[] , String partyName[] , int N){

        HashSet<String> set = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){

            if(!set.contains(voterId[i])){
                set.add(voterId[i]);

                if(map.containsKey(partyName[i])){
                    map.put(partyName[i], map.get(partyName[i]) + 1);

                }else{
                    map.put(partyName[i] , 1);
                }

            }
        }

//        System.out.println(set);
//         System.out.println(map);

        // Using for-each loop
        for (Map.Entry mapElement : map.entrySet()) {


            System.out.println(mapElement.getKey() + " " + mapElement.getValue());



        }
    }
    public static void main (String[] args)throws IOException {
        // Your code here
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = sc.nextInt();

        String voterId [] = new String[N];
        String partyName [] = new String[N];
        for(int i=0;i<N;i++){
            voterId[i] = sc.next();
            partyName[i] = sc.next();
        }



//        System.out.println(Arrays.toString(voterId));
//        System.out.println(Arrays.toString(partyName));

        evmMachine(voterId,partyName, N);

    }
}

//        4
//        12678345 BJP
//        57891082 Congress
//        12678345 AAP
//        65489 TMC