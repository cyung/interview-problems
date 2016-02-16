def get_other_products(num_list):
  running_products = []
  products_before_index = [None] * len(num_list)
  products_after_index = [None] * len(num_list)

  current_product_before = 1
  current_product_after = 1

  for idx, val in enumerate(num_list):
    index_after = len(num_list)-1-idx
    products_before_index[idx] = current_product_before
    products_after_index[index_after] = current_product_after
    current_product_before *= val
    current_product_after *= num_list[index_after]

  products = []
  for i in range(len(num_list)):
    products.append(products_before_index[i]*products_after_index[i])

  return products

if __name__ == "__main__":
  num_list = [2,3,4,5]

  print(get_other_products(num_list))