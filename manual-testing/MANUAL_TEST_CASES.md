# Manual Test Cases – Ecommerce Application

## Module: Login

| TC ID | Test Case Description | Steps | Expected Result |
|-----|----------------------|------|----------------|
| TC_01 | Verify login with valid credentials | Enter valid email and password → Click Login | User should login successfully |
| TC_02 | Verify login with invalid password | Enter valid email and invalid password → Click Login | Error message should be displayed |
| TC_03 | Verify login with invalid email | Enter invalid email and valid password → Click Login | Error message should be displayed |
| TC_04 | Verify login with empty fields | Click Login without entering credentials | Validation message should be displayed |

---

## Module: Add to Cart

| TC ID | Test Case Description | Steps | Expected Result |
|-----|----------------------|------|----------------|
| TC_05 | Add product to cart | Select product → Click Add to Cart | Product should be added to cart |
| TC_06 | Verify cart count update | Add product to cart | Cart count should increment |
| TC_07 | Remove product from cart | Remove product from cart | Product should be removed |

---

## Module: Logout

| TC ID | Test Case Description | Steps | Expected Result |
|-----|----------------------|------|----------------|
| TC_08 | Verify logout functionality | Click Logout | User should be logged out |
| TC_09 | Access application after logout | Press browser back button | User should not access dashboard |

---

## Module: UI Validation

| TC ID | Test Case Description | Steps | Expected Result |
|-----|----------------------|------|----------------|
| TC_10 | Verify page title | Open homepage | Correct page title should be displayed |
| TC_11 | Verify mandatory field indicators | Check login page | Mandatory fields should be marked |
