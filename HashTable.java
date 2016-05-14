package Hw4;
public class HashTable {
    DataItem[] hashArray; // array holds hash table
    int arraySize;//Array Size
    private DataItem nonItem; // for deleted items

    public HashTable(int size) // constructor
    {
        arraySize = getPrime(size*2);
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem("-1"); // deleted item key is -1

    }

    // -------------------------------------------------------------
    public int stringHashFunction(String userWordHash) {

        int hashCodeNum = userWordHash.hashCode();//takes input and hashes
        int countSpaces = userWordHash.length() - 1;//takes account of the spaces.
        int numOfFolds = 0;//
        int sum = 0;//
        String beforeSum = "";//the colletion of numbers before the sum and in one fold


        for (int i = 0; i < userWordHash.length(); i++)//traverses through the array
        {
            numOfFolds++;
            beforeSum += userWordHash.substring(i);
            if (numOfFolds == countSpaces) {//if input numfolds equals the amount of spaces traversed then excutute following code
                try {//catching letters or null pointers
                    sum += Integer.valueOf(beforeSum);//turn string into number and adds the sum
                    numOfFolds = 0;// resets
                    beforeSum = "";// resets
                } catch (Exception E) {
                }
            }
        }
        try {
            if (beforeSum != "")//this if statement accounts if the numbers arent split evenly
            {
                sum += Integer.valueOf(beforeSum);
            }
        } catch (Exception E) {
        }
        return sum % arraySize; //Returns the Index number!
    }

    // -------------------------------------------------------------

    public void insert(DataItem data) // insert a DataItem
    {
        int indexNum = stringHashFunction(data.getKey());//Hashed index
        while (hashArray[indexNum] != null)//while there are available spaces
        {
            try {
                if (hashArray[indexNum].getKey().compareTo("-1")==0)//looks for deleted num
                {
                    break;
                }
            }
            catch (Exception E) {}
            if (indexNum == hashArray.length - 1)// Accounts to WrapRound
            {
                indexNum = -1;
            }
            indexNum++;


        }
        hashArray[indexNum] = new DataItem(data.getKey());
    } // end insert()

    //------------------------------------------------------------------
    public DataItem delete(int key) // delete a DataItem
    {
        int hashVal = stringHashFunction(key + ""); // hash the key
        while (hashArray[hashVal] != null) // until empty cell,
        { // found the key?
            if (hashArray[hashVal].getKey() == key + "") {
                DataItem temp = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem; // delete item
                return temp; // return item
            }
            ++hashVal; // go to next cell
            hashVal %= arraySize; // wraparound if necessary
        }
        return null; // can’t find item
    } // end delete()

    public DataItem find(int key) // find item with key
    {
        int hashVal = stringHashFunction(key + "");// hash the key quick type cast
        try {
            while (hashArray[hashVal] != null) // until empty cell,
            {                                 // found the key?
                if (hashArray[hashVal].getKey() == key + "")
                    return hashArray[hashVal]; //return item
                ++hashVal; // go to next cell
                hashVal %= arraySize; // wraparound if necessary
            }

        }

        catch(Exception E) {}
        return null; // can’t find item
    }

    public int getArraySize() {
        return arraySize;
    }

    public int getHashArray(int index) {
        String number = hashArray[index].getKey();
        int numberInt = Integer.valueOf(number);
        return numberInt;
    }

    public boolean isItNull(int index){
        if(hashArray[index] == null){
            return true;
        }
        else{return false;}
    }

    private int getPrime(int min) {
        for (int j = min + 1; true; j++) {
            if (isPrime(j)) {
                return j;
            }
        }
    }

    private boolean isPrime(int n) {
        for (int j = 2; (j * j <= n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty(int indexNum) {
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] != null) {
                if (hashArray[i].getKey() != "-1") {
                    return false;
                }
            }
        }
        return true;
    }

    // -------------------------------------------------------------
    public boolean isFull() {
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] == null) {
                return false;
            }
            if (hashArray[i].getKey() == "-1") {
                return false;
            }

        }
        return true;
    }
}// end class HashTable
