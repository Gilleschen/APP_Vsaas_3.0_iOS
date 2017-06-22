# APP_Vsaas_3.0_iOS 使用說明

#### 測試前設定:

1. 於c槽新增txt文字文件，命名為device (路徑：c:\device.txt)
2. 開啟device.txt

3. 輸入手機UDID

	3.1 假設第一支手機的UDID為8f45421c3a13b476311368bb1f749eb；第二支手機的UDID為81c3a13b46b504a2011368bb1f，則依序輸入UDID，如下圖 (使用逗點區隔)
	
	![image](https://github.com/Gilleschen/APP_Vsaas_3.0_iOS/blob/master/picture/device.png)
	
4. 將StringTable.xls放置c槽 (路徑：c:\StringTable.xls)

5. 設定測試手機為英文語系

6. 安裝Appium studio (https://experitest.com/appium-studio/)

7. 新增測試手機至Appium studio並啟動手機 (請參考 ![Getting started](https://docs.experitest.com/display/public/AS/Getting+started))


===============================================================================

#### Ant Target:
Login_Junit, CreateAccount_Junit, ForgotPassword_Junit, LiveView_Junit

===============================================================================

#### 測試案例情境:

##### A. 登入 (Login_Junit):

	1. WrongEmail
	2. WrongPassword
	3. EmailBlank
	4. PasswordBlank

##### B. 創立帳號 (CreateAccount_Junit)
	
	1. CreateAccount
	2. InvaliedEmail
	3. ExistedAccount
	4. EmailBlank
	5. ConfirmPwdBlank
	6. NewPwdBlank
	7. NewPwdAndConfirmPwdNotMatch
	8. NicknameBlank
	9. DonotCheckTermsofUser
	10. WrongPwdRule
	
##### C. 忘記密碼 (ForgotPassword_Junit)
	
	1. EmailBlank
	2. InvalidEmail
	3. ForgotPwd
	
#### D. LiveView (LiveView_Junit)
	1. Portrait/Landscape模式
	 1.1 Listener
	 1.2 Speaker
	 1.3 Recording
	 1.4 Snapshot
	 1.5 Brightness
	 1.6 Contrast
	
===============================================================================

#### 建立測試期望結果

1. 開啟StringTable.xls (請勿更改附檔名)
	
2. \*_ExpectResult存放期望結果;\*_CaseName存放各案例名稱
	
3. 根據*_CaseName內各案例順序，於*_ExpectResult填入期望結果 (e.g. Login_CaseName內第一列第一欄案例為WrongEmail，則Login_ExpectResult的第一列第一欄填入期望結果為"Email or Password is not correct"，其餘依此類推)
	
##### 註:請勿更改*_CaseName內各案例順序
