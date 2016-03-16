package app;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Kevin+Jack
 */
public class MainUI extends JFrame implements ActionListener, ItemListener, ComponentListener, MouseListener {

    final int SCREEN_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    final int SCREEN_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    //LoadImageApp image=new LoadImageApp();
    JLabel Title;
    JPanel panel;
    JButton newProj, loadProj, info;

    boolean mpress = false;

    double Xmult = 1000.0 / this.getWidth();
    double Ymult = 700.0 / this.getHeight();
    private static MainUI UI;

    /**
     *
     */
    public MainUI() {
        initComponents();
    }

    /**
     *
     * @param title
     */
    @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
    public MainUI(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(500, 200, 1000, 700);

        this.addComponentListener(this);
        //this.setResizable(false);
        //this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(1000, 700));
        Title = new JLabel("<html>Jackscript</html>", SwingConstants.CENTER);
        Title.setSize(new Dimension(800, 100));
        Title.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        Title.setLocation((this.getWidth() / 2) - (Title.getWidth() / 2), 50 * (int) Ymult);
        Title.setFont(new Font("Courier New", 1, 80));
        Title.setForeground(new Color(200, 30, 60));
        newProj = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                newProj.setContentAreaFilled(false);

                Graphics2D g2d1 = (Graphics2D) g.create();
                RenderingHints hints1 = new RenderingHints(
                        RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                RenderingHints render1 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);

                Polygon backg = new Polygon();
                backg.addPoint(0, 0);
                backg.addPoint(0, 40);
                backg.addPoint(200, 40);
                GradientPaint gp = new GradientPaint(0.0f, 40.0f, new Color(20, 60, 120),
                        0.0f, 0.0f, new Color(0, 130, 200), true);

                g2d1.setPaint(gp);
                g2d1.fillRect(0, 0, 200, 40);
                super.paintComponent(g);
            }
        };
        newProj.setSize(200, 40);
        newProj.setLocation(centerX(newProj), 250);
        newProj.setText("<html><center>Create New Project</center></html>");
        newProj.setBackground(new Color(180, 180, 180));
        newProj.setFont(new Font("Courier New", 1, 18));
        newProj.setForeground(new Color(255, 255, 255));
        newProj.setMargin(new Insets(-5, -10, -10, -10));
        newProj.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        newProj.setFocusPainted(false);
        newProj.addActionListener(this);
        newProj.addItemListener(this);
        newProj.addMouseListener(this);
        loadProj = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                loadProj.setContentAreaFilled(false);

                Graphics2D g2d1 = (Graphics2D) g.create();
                RenderingHints hints1 = new RenderingHints(
                        RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                RenderingHints render1 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);

                Polygon backg = new Polygon();
                backg.addPoint(0, 0);
                backg.addPoint(0, 40);
                backg.addPoint(200, 40);
                GradientPaint gp = new GradientPaint(0.0f, 40.0f, new Color(20, 60, 120),
                        0.0f, 0.0f, new Color(0, 130, 200), true);

                g2d1.setPaint(gp);
                g2d1.fillRect(0, 0, 200, 40);
                super.paintComponent(g);
            }
        };
        loadProj.setSize(200, 40);
        loadProj.setLocation(centerX(loadProj), 320);
        loadProj.setText("<html><center>Load Project</center></html>");
        loadProj.setBackground(new Color(180, 180, 180));
        loadProj.setFont(new Font("Courier New", 1, 18));
        loadProj.setForeground(new Color(255, 255, 255));
        loadProj.setMargin(new Insets(-5, -10, -10, -10));
        loadProj.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        loadProj.setFocusPainted(false);
        loadProj.addActionListener(this);
        loadProj.addItemListener(this);
        loadProj.addMouseListener(this);
        info = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                info.setContentAreaFilled(false);

                Graphics2D g2d1 = (Graphics2D) g.create();
                RenderingHints hints1 = new RenderingHints(
                        RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                RenderingHints render1 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);

                Polygon backg = new Polygon();
                backg.addPoint(0, 0);
                backg.addPoint(0, 40);
                backg.addPoint(200, 40);
                GradientPaint gp = new GradientPaint(0.0f, 40.0f, new Color(20, 60, 120),
                        0.0f, 0.0f, new Color(0, 130, 200), true);

                g2d1.setPaint(gp);
                g2d1.fillRect(0, 0, 200, 40);
                super.paintComponent(g);
            }
        };
        info.setSize(200, 40);
        info.setLocation(centerX(info), 390);
        info.setText("<html><center>Information</center></html>");
        info.setBackground(new Color(180, 180, 180));
        info.setFont(new Font("Courier New", 1, 18));
        info.setForeground(new Color(255, 255, 255));
        info.setMargin(new Insets(-5, -10, -10, -10));
        info.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        info.setFocusPainted(false);
        info.addActionListener(this);
        info.addItemListener(this);
        info.addMouseListener(this);
        System.out.println(Title.getSize());
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d1 = (Graphics2D) g.create();
                RenderingHints hints1 = new RenderingHints(
                        RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                RenderingHints render1 = new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
                hints1.add(render1);
                g2d1.setRenderingHints(hints1);
                Polygon p1 = new Polygon();
                p1.addPoint(0, 0);
                p1.addPoint(0, 200);

                p1.addPoint(this.getWidth() + 50, 200);
                p1.addPoint(this.getWidth() + 50, 0);
                GradientPaint gp1 = new GradientPaint(0.0f, 200.0f, new Color(20, 60, 100),
                        0.0f, 0.0f, new Color(100, 200, 200, 255), true);

                g2d1.setColor(new Color(20, 60, 100));
                g2d1.fill(getBounds());
                g2d1.setPaint(gp1);
                g2d1.fill(p1);
            }
        };
        panel.setBackground(new Color(0, 0, 80));
        panel.add(Title);
        panel.add(newProj);
        panel.add(loadProj);
        panel.add(info);
        panel.setLayout(null);
        panel.setLocation(0, 0);
        this.add(panel);
        this.setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);

        bindingGroup.bind();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    // Variables declaration - do not modify                     
    // End of variables declaration                   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    // Variables declaration - do not modify                     

package app;

/**
 *
 * @author Kevin
     */
    /**
     *
     * @param o
     * @return
     */
    public int centerX(JComponent o) {
        return (this.getWidth() / 2) - (o.getWidth() / 2);
    }

    /**
     *
     * @param o
     * @param ycoord
     * @return
     */
    public int centerY(JComponent o, int ycoord) {
        return (int) (ycoord * Ymult);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        setUI(new MainUI("Jack Script"));
    }

    @Override
    public void itemStateChanged(ItemEvent arg0) {
        // TODO Auto-generated method stub	
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

    }

    @Override
    public void componentHidden(ComponentEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void componentMoved(ComponentEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void componentResized(ComponentEvent arg0) {
        if (this.getWidth() < 1000) {
            Xmult = 1000 / this.getWidth();
        } else {
            Xmult = this.getWidth() / 1000.0;
        }
        if (this.getHeight() < 700) {
            Ymult = 700 / this.getHeight();
        } else {
            Ymult = this.getHeight() / 700.0;
        }

        Title.setLocation(centerX(Title), centerY(Title, 50));
        newProj.setLocation(centerX(newProj), centerY(newProj, 250));
        loadProj.setLocation(centerX(loadProj), centerY(loadProj, 320));
        info.setLocation(centerX(info), centerY(info, 390));

        repaint();
    }

    @Override
    public void componentShown(ComponentEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        mpress = true;
        System.out.println("yes");
        if (e.getSource().equals(newProj) & mpress == true) {
            newProj.setBorder(BorderFactory.createBevelBorder(1));
        }
        if (e.getSource().equals(loadProj) & mpress == true) {
            loadProj.setBorder(BorderFactory.createBevelBorder(1));
        }
        if (e.getSource().equals(info) & mpress == true) {
            info.setBorder(BorderFactory.createBevelBorder(1));
        }
        this.processEvent(new ComponentEvent(this, SCREEN_HEIGHT));
        repaint();
        panel.setLocation(0, 0);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mpress = false;
        System.out.println("no");
        if (e.getSource().equals(newProj) & mpress == false) {
            newProj.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        }
        if (e.getSource().equals(loadProj) & mpress == false) {
            loadProj.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        }
        if (e.getSource().equals(info) & mpress == false) {
            info.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        }
        this.processEvent(new ComponentEvent(this, SCREEN_HEIGHT));
        repaint();
        panel.setLocation(0, 0);
    }

    /**
     *
     * @return
     */
    public static MainUI getUI() {
        return UI;
    }

    /**
     *
     * @param UI
     */
    public static void setUI(MainUI UI) {
        MainUI.UI = UI;
    }
}
