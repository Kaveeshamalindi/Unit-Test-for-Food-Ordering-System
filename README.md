# ✅ Food Ordering System – Automated Testing

## 💠 SE2305 – Software Verification and Validation

This repository contains an example of automated unit testing for a Food Ordering System developed for the SE2305 Software Verification and Validation assignment.

The automated test verifies that the system correctly calculates the total amount of food items added to a customer's cart.

---

## 💠 Testing Objective

The main objective of this automated test is to verify the ```calculateTotalAmount()``` method in the FoodOrder class.

The test checks whether the system correctly adds the prices of multiple food items and returns the expected total amount.

**For example:**

- Pizza = 1500
- Burger = 800
- Expected total = 2300

The automated test confirms that the calculated total is equal to 2300.

---

## 💠 How to Run

1. Clone the repository:

```
git clone https://github.com/Kaveeshamalindi/Unit-Test-for-Food-Ordering-System.git
```
2. Open the project in VS Code

3. Run the Unit Tests

---

## 💠 Benefits of Automation

**Automating this test provides several benefits:**

- Saves time by executing the test automatically.
- Reduces human error when checking expected results.
- Supports regression testing when the code is changed.
- Provides repeatable results every time the test is executed.
- Detects defects early during development.
- Allows multiple tests to be executed quickly.

---

## 💠 Limitations

**Although automated testing is useful and it also has some limitations:**

- Initial development of automated tests requires time.
- Tests need to be maintained when the application changes.
- Automated unit tests cannot completely replace manual testing.
- User interface usability and some real-world user behaviour may require manual testing.

Therefore, automated testing should be combined with other testing approaches.

---

## 💠 Conclusion

This JUnit automation example demonstrates how automated unit testing can be used to verify a key function of a food ordering system. 
The test automatically checks whether the total price of food items is calculated correctly. 
Using JUnit helps detect defects early, reduce manual effort, and support reliable regression testing throughout the software development lifecycle.
