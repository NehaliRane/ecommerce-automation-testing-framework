# Manual Test Cases – AutomationExercise

## Module: Login Functionality

### TC_001 – Valid Login
- Preconditions: User is registered
- Steps:
  1. Open login page
  2. Enter valid email
  3. Enter valid password
  4. Click Login
- Expected Result: User should login successfully

---

### TC_002 – Invalid Password
- Steps:
  1. Open login page
  2. Enter valid email
  3. Enter invalid password
  4. Click Login
- Expected Result: Error message should be displayed

---

### TC_003 – Empty Email and Password
- Steps:
  1. Open login page
  2. Leave email and password empty
  3. Click Login
- Expected Result: Validation message should be shown
