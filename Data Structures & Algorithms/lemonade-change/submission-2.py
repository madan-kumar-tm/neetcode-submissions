class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        five, ten, twenty = 0, 0, 0
        for i in range(len(bills)):
            if bills[i] == 5:
                five = five+1
            if bills[i] == 10:
                if five >= 1:
                    five = five - 1
                    ten = ten + 1
                else:
                    return False
            if bills[i] == 20:
                if five >= 3:
                    five = five - 3
                    twenty =  twenty + 1
                elif five >= 1 and ten >= 1:
                    five = five - 1
                    ten = ten - 1
                else:
                    return False
        return True

        