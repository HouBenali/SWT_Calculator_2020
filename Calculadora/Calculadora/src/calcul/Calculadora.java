package calcul;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;

public class Calculadora {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculadora window = new Calculadora();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(525, 361);
		shell.setText("SWT Application");
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(0, 0, 507, 358);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		Composite composite = new Composite(scrolledComposite, SWT.NONE);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setBounds(23, 76, 457, 217);
		
		Button button = new Button(composite_1, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"1");
			}
		});
		button.setBounds(10, 10, 60, 30);
		button.setText("1");
		
		Button button_1 = new Button(composite_1, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"2");
			}
		});
		button_1.setBounds(86, 10, 60, 30);
		button_1.setText("2");
		
		Button button_2 = new Button(composite_1, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"3");
			}
		});
		button_2.setBounds(163, 10, 60, 30);
		button_2.setText("3");
		
		Button button_3 = new Button(composite_1, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"4");
			}
		});
		button_3.setBounds(10, 65, 60, 30);
		button_3.setText("4");
		
		Button button_4 = new Button(composite_1, SWT.NONE);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"5");
			}
		});
		button_4.setBounds(86, 65, 60, 30);
		button_4.setText("5");
		
		Button button_4_1 = new Button(composite_1, SWT.NONE);
		button_4_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"6");
			}
		});
		button_4_1.setText("6");
		button_4_1.setBounds(163, 65, 60, 30);
		
		Button button_5 = new Button(composite_1, SWT.NONE);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"7");
			}
		});
		button_5.setBounds(10, 119, 60, 30);
		button_5.setText("7");
		
		Button button_6 = new Button(composite_1, SWT.NONE);
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"8");
			}
		});
		button_6.setBounds(86, 119, 60, 30);
		button_6.setText("8");
		
		Button button_7 = new Button(composite_1, SWT.NONE);
		button_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"9");
			}
		});
		button_7.setBounds(163, 119, 65, 30);
		button_7.setText("9");
		
		Button button_8 = new Button(composite_1, SWT.NONE);
		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"0");
			}
		});
		button_8.setBounds(86, 171, 60, 30);
		button_8.setText("0");
		
		Button button_9 = new Button(composite_1, SWT.NONE);
		button_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"+");
			}
		});
		button_9.setBounds(290, 10, 60, 30);
		button_9.setText("+");
		
		Button button_10 = new Button(composite_1, SWT.NONE);
		button_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"-");
			}
		});
		button_10.setBounds(373, 10, 60, 30);
		button_10.setText("-");
		
		Button button_11 = new Button(composite_1, SWT.NONE);
		button_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"*");
			}
		});
		button_11.setBounds(290, 65, 60, 30);
		button_11.setText("*");
		
		Button button_12 = new Button(composite_1, SWT.NONE);
		button_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+"/");
			}
		});
		
		button_12.setBounds(373, 65, 60, 30);
		button_12.setText("/");
		
		Button button_13 = new Button(composite_1, SWT.NONE);
		button_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				System.out.println(prev);

			    ScriptEngineManager mgr = new ScriptEngineManager();
			    ScriptEngine engine = mgr.getEngineByName("js");
					Double x;
					try {
						x = (Double) engine.eval(prev);
						text.setText(String.valueOf(x));
					} catch (ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						text.setText("Error");
					}

	
			}
		});
		button_13.setBounds(290, 119, 143, 30);
		button_13.setText("=");
		
		Button btnCe = new Button(composite_1, SWT.NONE);
		btnCe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				text.setText("");
			}
		});
		
		btnCe.setBounds(292, 171, 60, 30);
		btnCe.setText("CE");
		
		Button button_14 = new Button(composite_1, SWT.NONE);
		button_14.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String prev=text.getText();
				text.setText(prev+".");
			}
		});
		
		button_14.setBounds(373, 171, 60, 30);
		button_14.setText(",");
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(23, 20, 457, 39);
		scrolledComposite.setContent(composite);
		scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		
	}
}
