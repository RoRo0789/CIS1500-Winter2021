package project4;

import java.util.ArrayList;

public class BigInt {

    private ArrayList<Integer> digits;
    private boolean positive;

    // only for us to use in the add/substract methods
    private BigInt() {
        digits = new ArrayList<Integer>();
        positive = true;
    }

    public BigInt(String value) {
        positive = true;
        digits = new ArrayList<Integer>();
        int index = 0;
        if (value.startsWith("-")) {
            positive = false;
            index = 1;
        }
        while (index < value.length()) {
            if (value.charAt(index) != ',') {
                digits.add(Integer.parseInt(Character.toString(value.charAt(index))));
            }
            index++;
        }
    }

    private boolean isBigger(BigInt other) {
        if (digits.size() > other.digits.size()) {
            return true;
        }
        if (digits.size() < other.digits.size()) {
            return false;
        }
        for (int index = 0; index < digits.size(); index++) {
            if (digits.get(index) > other.digits.get(index)) {
                return true;
            }
            if (digits.get(index) < other.digits.get(index)) {
                return false;
            }
        }
        return false;
    }

    public BigInt add(BigInt other) {
        if (positive && other.positive || !positive && !other.positive) {
            if (isBigger(other)) {
                BigInt result = addSmallerToBiggerIgnoreSign(other);
                result.positive = positive;
                return result;
            } else {
                BigInt result = other.addSmallerToBiggerIgnoreSign(this);
                result.positive = other.positive;
                return result;
            }
        }

        if (isBigger(other)) {
            BigInt result = subtractSmallerFromBiggerIgnoreSign(other);
            result.positive = positive;
            return result;
        } else {
            BigInt result = other.subtractSmallerFromBiggerIgnoreSign(this);
            result.positive = other.positive;
            return result;
        }

    }

    private BigInt addSmallerToBiggerIgnoreSign(BigInt other) {
        BigInt newResult = new BigInt();

        int myIndex = digits.size() - 1;
        int otherIndex = other.digits.size() - 1;

        boolean carry = false;
        while (myIndex >= 0 && otherIndex >= 0) {
            int newDigit = digits.get(myIndex) + other.digits.get(otherIndex);

            if (carry) {
                newDigit++;
                carry = false;
            }

            if (newDigit >= 10) {
                carry = true;
                newDigit -= 10;
            }
            newResult.digits.add(0, newDigit);

            myIndex--;
            otherIndex--;
        }

        while (myIndex >= 0) {
            int newDigit = digits.get(myIndex);
            if (carry) {
                newDigit++;
                carry = false;
            }

            if (newDigit >= 10) {
                carry = true;
                newDigit -= 10;
            }
            newResult.digits.add(0, newDigit);
            myIndex--;

        }
        
        if ( carry ){
            newResult.digits.add(0, 1);
        }

        newResult.positive = positive;

        return newResult;
    }

    private BigInt subtractSmallerFromBiggerIgnoreSign(BigInt other) {
        BigInt result = new BigInt();

        int myIndex = digits.size() - 1;
        int otherIndex = other.digits.size() - 1;

        boolean borrowed = false;
        while (myIndex >= 0 && otherIndex >= 0) {
            int myDigit = digits.get(myIndex);

            if (borrowed) {
                myDigit--;
                borrowed = false;
            }

            int otherDigit = other.digits.get(otherIndex);

            if (otherDigit > myDigit) {
                myDigit += 10;
                borrowed = true;
            }

            result.digits.add(0, myDigit - otherDigit);

            myIndex--;
            otherIndex--;

        }

        while (myIndex >= 0) {
            int myDigit = digits.get(myIndex);

            if (borrowed) {
                myDigit--;
                borrowed = false;
            }
            result.digits.add(0, myDigit);

            myIndex--;

        }

        return result;

    }

    public BigInt subtract(BigInt other) {
        // do not change yourself or the other, return a new big int
        if (positive && other.positive || !positive && !other.positive) {
            if (isBigger(other)) {
                BigInt result = subtractSmallerFromBiggerIgnoreSign(other);
                result.positive = positive;
                return result;
            } else {
                BigInt result = other.subtractSmallerFromBiggerIgnoreSign(this);
                result.positive = !other.positive;
                return result;
            }
        }
        
        if ( isBigger(other)){
            BigInt result = addSmallerToBiggerIgnoreSign(other);
            result.positive = positive;
            return result;
        }
        else{
            BigInt result = other.addSmallerToBiggerIgnoreSign(this);
            result.positive = positive;
            return result;
        }


    }

    public String toString() {
        // return a nicely formatted string with thousands seperator
        // ie -12,345,678

        StringBuilder stringBuilder = new StringBuilder();

        if (!positive) {
            stringBuilder.append("-");
        }

        for (int index = 0; index < digits.size(); index++) {
            if (index != 0 && (digits.size() - index) % 3 == 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(digits.get(index));
        }
        return stringBuilder.toString();
    }
}
