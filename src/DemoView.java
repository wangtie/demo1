import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;


public class DemoView extends ViewPart {

	public DemoView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Text text=new Text(parent,SWT.NONE);
		text.setText("this is a good");

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
