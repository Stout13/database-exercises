import pandas as pd
import numpy as np


# from google.colab import drive
# drive.mount('/content/drive')

price = [2, 1, 10, 0, 0, 0, 0]
type(price)

quantity = [17, 40, 1, 0, 0, 0, 0]
type(quantity)

price_array = np.array(price)
quantity_array = np.array(quantity)
type(price_array)

price_array * quantity_array


cost_array = np.array([0.25, 0.50, 5.00, 0, 0, 0, 0])

profit_array = price_array - cost_array
print(profit_array)

profit_array > 2.00


price_array = np.put(price_array, 3, 7)
print(price_array)

price_array = np.append(price_array, [4.50, 3, 4, 9])
print(price_array)

print(price_array.dtype)

price_array = np.delete(price_array, 0)
print(price_array)

price_array[2] = 12
print(price_array)

print(quantity_array)

print(quantity)

quantity_array = quantity_array.tolist()

other_things = [2, 3, 16, 5]

all_the_things = other_things + quantity_array


for x in range(4):
  all_the_things.pop(7)

print(all_the_things)

print(all_the_things)

array_of_all_the_things = np.array(all_the_things)

spoilage = np.array([0, 0, 0, 0, 0, 1, 0])
array_of_all_the_things = np.subtract(array_of_all_the_things, spoilage)
leftovers = np.array([1, 6, 0, 2, 2, 1, 2])

total_items_sold = np.subtract(array_of_all_the_things, leftovers)

print(total_items_sold)

print(price_array)

price_array = np.append(price_array, [0.0, 0.0, 0.0])

print(price_array)

revenue_if_all_items_sold = np.multiply(total_items_sold, price_array)
sum_revenue = revenue_if_all_items_sold.sum()
print(sum_revenue)

leftover_revenue = np.multiply(leftovers, price_array)
leftover_revenue = leftover_revenue.sum()*.5

print('clearance sale yielded ' + str(leftover_revenue))



cost_array = np.array(cost_array)

print(str(cost_array) + ' ' + str(total_items_sold))

np.multiply(cost_array, total_items_sold)

total_profit = ((leftover_revenue + sum_revenue) - (np.sum(np.multiply(cost_array, leftovers)) + np.sum(np.multiply(cost_array, total_items_sold))))

print(total_profit)

print('The bake sale and clearance sale together yielded ' + str(total_profit) + ' dollars')