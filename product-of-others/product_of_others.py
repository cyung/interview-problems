def product_of_others(num_list):
  products_before_index = []
  products_except_at_index = [None] * len(num_list)

  current_product_before = 1
  current_product_after = 1

  for num in num_list:
    products_before_index.append(current_product_before)
    current_product_before *= num

  i = len(num_list) - 1
  while i >= 0:
    products_except_at_index[i] = products_before_index[i] * current_product_after
    current_product_after *= num_list[i]
    i -= 1

  return products_except_at_index

if __name__ == "__main__":
  num_list = [2,3,4,5]

  print(product_of_others(num_list))