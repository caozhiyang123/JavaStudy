package cn.designMode.demo.stateMode;

public class FileContext
{
    private FileState fileState;

    public FileContext(FileState fileState)
    {
        this.fileState = fileState;
    }

    public void setFileState(FileState fileState)
    {
        this.fileState = fileState;
    }
    
    public void fileState(){
        fileState.fileState();
    }
}
