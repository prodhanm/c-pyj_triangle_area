def tri_area(base, height):
    area = (base * height) / 2
    return area

def main():
    b = float(input("Enter the base of the triangle: "))
    h = float(input("Enter the height of the triangle: "))
    area = tri_area(b, h)
    print("The area of the triangle is:", round(area, 2))

if __name__ == "__main__":
    main()