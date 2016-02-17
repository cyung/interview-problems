def largest_product(num_list):
  if len(num_list) < 3:
    raise IndexError('need at least three numbers')

  max_product_of_2 = num_list[0] * num_list[1]
  min_product_of_2 = max_product_of_2
  max_num = max(num_list[0], num_list[1])
  min_num = min(num_list[0], num_list[1])
  max_product_of_3 = num_list[0] * num_list[1] * num_list[2]

  for num in num_list[2:]:
    max_product_of_3 = max(max_product_of_3,
      max_product_of_2 * num, min_product_of_2 * num)
    max_product_of_2 = max(max_product_of_2,
      max_num * num, min_num * num)
    min_product_of_2 = min(min_product_of_2,
      min_num * num, min_num * num)
    max_num = max(max_num, num)
    min_num = min(min_num, num)

  return max_product_of_3

if __name__ == "__main__":
  num_list = [-7, -2, 3, 10, 3]
  print(largest_product(num_list))