
---

## 🧱 Class Descriptions

### 1️⃣ Phone.java (Model Class)

Represents the Phone entity.

**Attributes:**
- id
- name
- brand
- cost
- cameraPx
- dateOfManufacture

Includes:
- Constructor
- Getter methods
- toString() method

---

### 2️⃣ PhoneManager.java (Service Class)

Handles all business logic operations:

- `addPhone()` → Adds a phone to the list
- `removeById()` → Removes phone using ID
- `filterByBrand()` → Returns phones of a specific brand
- `sortByName()` → Sorts phones alphabetically
- `sortByNameDescending()` → Sorts by name in descending order
- `sortByCost()` → Sorts phones by cost (ascending)
- `sortByCostDescending()` → Sorts phones by cost (descending)
- `sortByDate()` → Sorts phones by date of manufacture (ascending)
- `sortByDateDescending()` → Sorts phones by date of manufacture (descending)
- `getAllPhones()` → Returns list of all phones

---

### 3️⃣ NameComparator.java

Implements `Comparator<Phone>`  
Used to sort phones alphabetically by name.

---

### 4️⃣ CostComparator.java

Implements `Comparator<Phone>`  
Used to sort phones based on cost.

---

### 5️⃣ Main.java

Contains the `main()` method.

Responsibilities:
- Creates Phone objects
- Calls PhoneManager methods
- Displays output

---

## ⚙ Features Implemented

✔ Add Phone  
✔ Remove Phone by ID  
✔ Filter Phones by Brand  
✔ Sort by Name (Ascending & Descending)  
✔ Sort by Cost (Ascending & Descending)  
✔ Sort by Date of Manufacture (Ascending & Descending)  
✔ Safe removal using Iterator  


---

### sample outputs

---
<img width="955" height="289" alt="image" src="https://github.com/user-attachments/assets/3559b8c7-41f1-4867-896c-66a69ac9a56b" />
<img width="870" height="205" alt="image" src="https://github.com/user-attachments/assets/a93ea51a-389b-4367-9a12-29fd621367c5" />




