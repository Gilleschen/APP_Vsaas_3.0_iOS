# APP_Vsaas_3.0_iOS 登入介面自動化測試使用說明

#### 步驟：

1. 於c槽新增txt文字文件，命名為device (路徑：c:\device.txt)
2. 開啟device.txt

3. 輸入手機UDID

	3.1 假設第一支手機的UDID為8f45421c3a13b476311368bb1f749eb；第二支手機的UDID為81c3a13b46b504a2011368bb1f，則依序輸入UDID，如下圖 (使用逗點區隔)
	
	![image](https://github.com/Gilleschen/APP_Vsaas_3.0_iOS/blob/master/picture/device.png)
	
4. 將StringTable.xls放置c槽 (路徑：c:\StringTable.xls)


=================================================================================

Ant Target:
Login_Junit, CreateAccount_Junit, ForgotPassword_Junit
