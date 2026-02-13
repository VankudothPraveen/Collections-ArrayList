
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
<img width="891" height="357" alt="image" src="https://github.com/user-attachments/assets/ab941ee8-28e0-4e9a-8880-180e165a9254" />
<img width="865" height="343" alt="image" src="https://github.com/user-attachments/assets/10b43020-f25a-4490-b71a-ec65d799cd1f" />





