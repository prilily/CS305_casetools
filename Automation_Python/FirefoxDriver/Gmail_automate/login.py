from selenium import webdriver
browser = webdriver.Firefox()
MyUserName=" "
MyPassword=" "

browser.get('http://gmail.com')

emailElem = browser.find_element_by_id('identifierId')
emailElem.send_keys(MyUserName)
next=web.find_element_by_xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")
next.click()
passwordElem = browser.find_element_by_id('Passwd')
passwordElem.send_keys(MyPassword)
signinButton = browser.find_element_by_id('signIn')
signinButton.click()
