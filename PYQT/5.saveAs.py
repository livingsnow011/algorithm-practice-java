import sys 
from PyQt5.QtWidgets import *
from PyQt5 import uic

form_class = uic.loadUiType("5.saveAs.ui")[0]
class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super ().__init__()
        self.setupUi(self)

        self.action_open.triggered.connect(self.openFunction)
        self.action_save.triggered.connect(self.saveFunction)

        self.opened = False
        self.opened_file_path = ''


    def save_file(self,fname):            
        data = self.plainTextEdit.toPlainText()
        with open(fname[0],'w',encoding = "UTF-8") as f:
                f.write(data)

        print("save {}!!".format((fname[0])))

    def open_file(self,fname):            
        with open(fname,encoding = "UTF-8") as f:
                data = f.read()
        self.plainTextEdit.setPlainText(data)
        self.opened = True
        self.opened_file_path = fname

        print("open {}!!".format(fname))

    def openFunction(self):
            fname=QFileDialog().getOpenFileName(self)
            if(fname[0]):
                open_file(fname[0])
    

    def saveFunction(self):
        if self.opened:
                self.save_file(self.opened_file_path)
        else:
            self.saveAsFunction()

    def saveAsFunction(self):
            fname=QFileDialog().getSaveFileName(self)
            if(fname[0]):
                self.save_file(fname[0])

app = QApplication(sys.argv)
mainWindow = WindowClass()    
mainWindow.show()
app.exec_()