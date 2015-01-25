// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HelipadData.java

package com.zbluesoftware.fsxp.ui.data;

import com.zbluesoftware.fsxp.engine.*;
import com.zbluesoftware.fsxp.graphics.IconFactory;
import com.zbluesoftware.fsxp.model.BaseModel;
import com.zbluesoftware.fsxp.model.HelipadModel;
import com.zbluesoftware.fsxp.ui.WindowBorder;
import com.zbluesoftware.fsxp.util.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// Referenced classes of package com.zbluesoftware.fsxp.ui.data:
//            ObjectData

public class HelipadData extends ObjectData
    implements ActionListener, ChangeListener, FocusListener, PropertyChangeListener
{

    public HelipadData()
    {
        listeners = new Vector();
        setLayout(new BorderLayout(2, 2));
        lockingButton = new JButton(IconFactory.getInstance().getIcon("padlockUnlocked"));
        lockingButton.setBorder(new EmptyBorder(5, 5, 5, 5));
        lockingButton.setToolTipText("Lock/Unlock Helipads");
        lockingButton.addActionListener(this);
        if(LockingEngine.getInstance().getHelipadsLocked())
            lockingButton.setIcon(IconFactory.getInstance().getIcon("padlockLocked"));
        deleteButton = new JButton(IconFactory.getInstance().getIcon("delete"));
        deleteButton.setBorder(new EmptyBorder(5, 5, 5, 5));
        deleteButton.setToolTipText("Delete");
        deleteButton.addActionListener(this);
        JPanel buttonPanel = new JPanel(new FlowLayout(2));
        buttonPanel.add(lockingButton);
        buttonPanel.add(deleteButton);
        latLabel = new JLabel("Latitude");
        latLabel.setFont(Utilities.LABEL_FONT);
        latLabel.setForeground(Color.black);
        latTF = new PopupTextField(20);
        latTF.setFont(Utilities.TEXT_FIELD_FONT);
        latTF.setForeground(Color.black);
        latTF.addActionListener(this);
        latTF.addFocusListener(this);
        if(LockingEngine.getInstance().getHelipadsLocked())
            latTF.setBackground(Color.red);
        lonLabel = new JLabel("Longitude");
        lonLabel.setFont(Utilities.LABEL_FONT);
        lonLabel.setForeground(Color.black);
        lonTF = new PopupTextField(20);
        lonTF.setFont(Utilities.TEXT_FIELD_FONT);
        lonTF.setForeground(Color.black);
        lonTF.addActionListener(this);
        lonTF.addFocusListener(this);
        if(LockingEngine.getInstance().getHelipadsLocked())
            lonTF.setBackground(Color.red);
        altLabel = new JLabel("Altitude");
        altLabel.setFont(Utilities.LABEL_FONT);
        altLabel.setForeground(Color.black);
        altSpinner = new JSpinner(new SpinnerNumberModel(0.0D, -5000D, 100000D, 1.0D));
        altSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(altSpinner, "0.000"));
        altSpinner.addChangeListener(this);
        altComboBox = new JComboBox(new String[] {
            "M", "F"
        });
        altComboBox.setFont(Utilities.COMBO_BOX_FONT);
        altComboBox.setForeground(Color.black);
        altComboBox.addActionListener(this);
        if(SettingsEngine.getInstance().getLAF().equals("Windows"))
            altComboBox.setPrototypeDisplayValue("--------");
        headingLabel = new JLabel("Heading");
        headingLabel.setFont(Utilities.LABEL_FONT);
        headingLabel.setForeground(Color.black);
        headingTF = new PopupTextField(5);
        headingTF.setFont(Utilities.TEXT_FIELD_FONT);
        headingTF.setForeground(Color.black);
        headingTF.addActionListener(this);
        headingTF.addFocusListener(this);
        headingSlider = new JSlider(0);
        headingSlider.setModel(new DefaultBoundedRangeModel(0, 1, 0, 360));
        headingSlider.setPreferredSize(new Dimension(100, headingSlider.getPreferredSize().height));
        headingSlider.addChangeListener(this);
        JPanel headingPanel = new JPanel(new GridBagLayout());
        Utilities.addComponent(headingPanel, headingTF, 0, 0, 1, 1, 2, 13, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(headingPanel, headingSlider, 1, 0, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        lengthLabel = new JLabel("Length");
        lengthLabel.setFont(Utilities.LABEL_FONT);
        lengthLabel.setForeground(Color.black);
        lengthSpinner = new JSpinner(new SpinnerNumberModel(2D, 2D, 10000D, 1.0D));
        lengthSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(lengthSpinner, "0.000"));
        lengthSpinner.addChangeListener(this);
        lengthComboBox = new JComboBox(new String[] {
            "M", "F"
        });
        lengthComboBox.setFont(Utilities.COMBO_BOX_FONT);
        lengthComboBox.setForeground(Color.black);
        lengthComboBox.addActionListener(this);
        if(SettingsEngine.getInstance().getLAF().equals("Windows"))
            lengthComboBox.setPrototypeDisplayValue("--------");
        JPanel lengthPanel = new JPanel(new GridBagLayout());
        Utilities.addComponent(lengthPanel, lengthSpinner, 0, 0, 1, 1, 2, 13, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(lengthPanel, lengthComboBox, 1, 0, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        widthLabel = new JLabel("Width");
        widthLabel.setFont(Utilities.LABEL_FONT);
        widthLabel.setForeground(Color.black);
        widthSpinner = new JSpinner(new SpinnerNumberModel(2D, 2D, 10000D, 1.0D));
        widthSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(widthSpinner, "0.000"));
        widthSpinner.addChangeListener(this);
        widthComboBox = new JComboBox(new String[] {
            "M", "F"
        });
        widthComboBox.setFont(Utilities.COMBO_BOX_FONT);
        widthComboBox.setForeground(Color.black);
        widthComboBox.addActionListener(this);
        if(SettingsEngine.getInstance().getLAF().equals("Windows"))
            widthComboBox.setPrototypeDisplayValue("--------");
        JPanel widthPanel = new JPanel(new GridBagLayout());
        Utilities.addComponent(widthPanel, widthSpinner, 0, 0, 1, 1, 2, 13, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(widthPanel, widthComboBox, 1, 0, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        typeLabel = new JLabel("Type");
        typeLabel.setFont(Utilities.LABEL_FONT);
        typeLabel.setForeground(Color.black);
        DefaultComboBoxModel typeModel = new DefaultComboBoxModel();
        typeModel.addElement("NONE");
        typeModel.addElement("CIRCLE");
        typeModel.addElement("H");
        typeModel.addElement("MEDICAL");
        typeModel.addElement("SQUARE");
        typeComboBox = new JComboBox(typeModel);
        typeComboBox.setFont(Utilities.COMBO_BOX_FONT);
        typeComboBox.setForeground(Color.black);
        typeComboBox.addActionListener(this);
        surfaceLabel = new JLabel("Surface");
        surfaceLabel.setFont(Utilities.LABEL_FONT);
        surfaceLabel.setForeground(Color.black);
        DefaultComboBoxModel surfaceModel = new DefaultComboBoxModel();
        surfaceModel.addElement("ASPHALT");
        surfaceModel.addElement("BITUMINOUS");
        surfaceModel.addElement("BRICK");
        surfaceModel.addElement("CLAY");
        surfaceModel.addElement("CEMENT");
        surfaceModel.addElement("CONCRETE");
        surfaceModel.addElement("CORAL");
        surfaceModel.addElement("DIRT");
        surfaceModel.addElement("GRASS");
        surfaceModel.addElement("GRAVEL");
        surfaceModel.addElement("ICE");
        surfaceModel.addElement("MACADAM");
        surfaceModel.addElement("OIL_TREATED, PLANKS");
        surfaceModel.addElement("SAND");
        surfaceModel.addElement("SHALE");
        surfaceModel.addElement("SNOW");
        surfaceModel.addElement("STEEL_MATS");
        surfaceModel.addElement("TARMAC");
        surfaceModel.addElement("UNKNOWN");
        surfaceModel.addElement("WATER");
        surfaceComboBox = new JComboBox(surfaceModel);
        surfaceComboBox.setFont(Utilities.COMBO_BOX_FONT);
        surfaceComboBox.setForeground(Color.black);
        surfaceComboBox.addActionListener(this);
        closedLabel = new JLabel("Closed");
        closedLabel.setFont(Utilities.LABEL_FONT);
        closedLabel.setForeground(Color.black);
        closedComboBox = new JComboBox(getTrueFalseModel());
        closedComboBox.setFont(Utilities.COMBO_BOX_FONT);
        closedComboBox.setForeground(Color.black);
        closedComboBox.addActionListener(this);
        transLabel = new JLabel("Transparent");
        transLabel.setFont(Utilities.LABEL_FONT);
        transLabel.setForeground(Color.black);
        transComboBox = new JComboBox(getTrueFalseModel());
        transComboBox.setFont(Utilities.COMBO_BOX_FONT);
        transComboBox.setForeground(Color.black);
        transComboBox.addActionListener(this);
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        Utilities.addComponent(mainPanel, buttonPanel, 0, 0, 3, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, latLabel, 0, 1, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, latTF, 1, 1, 2, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, lonLabel, 0, 2, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, lonTF, 1, 2, 2, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, altLabel, 0, 3, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, altSpinner, 1, 3, 1, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, altComboBox, 2, 3, 1, 1, 0, 17, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, headingLabel, 0, 4, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, headingPanel, 1, 4, 2, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, lengthLabel, 0, 5, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, lengthPanel, 1, 5, 2, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, widthLabel, 0, 6, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, widthPanel, 1, 6, 2, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, typeLabel, 0, 7, 1, 1, 0, 13, new Insets(10, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, typeComboBox, 1, 7, 2, 1, 2, 17, new Insets(10, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, surfaceLabel, 0, 8, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, surfaceComboBox, 1, 8, 2, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, closedLabel, 0, 9, 1, 1, 0, 13, new Insets(10, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, closedComboBox, 1, 9, 2, 1, 2, 17, new Insets(10, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, transLabel, 0, 10, 1, 1, 0, 13, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.0D);
        Utilities.addComponent(mainPanel, transComboBox, 1, 10, 2, 1, 2, 17, new Insets(1, 1, 1, 1), 0, 0, 0.5D, 0.0D);
        Utilities.addComponent(mainPanel, Box.createGlue(), 0, 11, 3, 1, 3, 17, new Insets(1, 1, 1, 1), 0, 0, 0.0D, 0.5D);
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane, "Center");
        windowBorder = new WindowBorder("Helipad Data");
        setBorder(windowBorder);
        LockingEngine.getInstance().addPropertyChangeListener(this);
    }

    private DefaultComboBoxModel getTrueFalseModel()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("TRUE");
        model.addElement("FALSE");
        return model;
    }

    public void updateDisplay(BaseModel baseModel)
    {
        HelipadModel model = null;
        if(baseModel instanceof HelipadModel)
            model = (HelipadModel)baseModel;
        if(this.model != null)
            this.model.removePropertyChangeListener(this);
        updateModel();
        this.model = model;
        boolean status = true;
        altSpinner.removeChangeListener(this);
        altComboBox.removeActionListener(this);
        lengthSpinner.removeChangeListener(this);
        lengthComboBox.removeActionListener(this);
        widthSpinner.removeChangeListener(this);
        widthComboBox.removeActionListener(this);
        surfaceComboBox.removeActionListener(this);
        closedComboBox.removeActionListener(this);
        transComboBox.removeActionListener(this);
        if(model != null)
        {
            latTF.setText(DisplayEngine.getInstance().formatObjectLatitude(model.getLatLon().getLat()));
            lonTF.setText(DisplayEngine.getInstance().formatObjectLongitude(model.getLatLon().getLon()));
            altSpinner.setValue(new Double(model.getAlt()));
            altComboBox.setSelectedItem(model.getAltMeasure());
            headingSlider.setValue((int)model.getHeading());
            headingTF.setText((new StringBuilder()).append("").append(model.getHeading()).toString());
            lengthSpinner.setValue(new Double(model.getLength()));
            lengthComboBox.setSelectedItem(model.getLengthMeasure());
            widthSpinner.setValue(new Double(model.getWidth()));
            widthComboBox.setSelectedItem(model.getWidthMeasure());
            surfaceComboBox.setSelectedItem(model.getSurface());
            typeComboBox.setSelectedItem(model.getType());
            closedComboBox.setSelectedIndex(model.getClosed() ? 0 : 1);
            transComboBox.setSelectedIndex(model.getTransparent() ? 0 : 1);
            model.addPropertyChangeListener(this);
        } else
        {
            latTF.setText("");
            lonTF.setText("");
            altSpinner.setValue(new Double(0.0D));
            altComboBox.setSelectedIndex(0);
            headingSlider.setValue(0);
            headingTF.setText("");
            lengthSpinner.setValue(new Double(0.0D));
            lengthComboBox.setSelectedIndex(0);
            widthSpinner.setValue(new Double(0.0D));
            widthComboBox.setSelectedIndex(0);
            surfaceComboBox.setSelectedIndex(0);
            typeComboBox.setSelectedIndex(0);
            closedComboBox.setSelectedIndex(0);
            transComboBox.setSelectedIndex(0);
            status = false;
        }
        altSpinner.addChangeListener(this);
        altComboBox.addActionListener(this);
        lengthSpinner.addChangeListener(this);
        lengthComboBox.addActionListener(this);
        widthSpinner.addChangeListener(this);
        widthComboBox.addActionListener(this);
        surfaceComboBox.addActionListener(this);
        closedComboBox.addActionListener(this);
        transComboBox.addActionListener(this);
        deleteButton.setEnabled(status);
        lockingButton.setEnabled(status);
        latLabel.setEnabled(status);
        latTF.setEnabled(status);
        lonLabel.setEnabled(status);
        lonTF.setEnabled(status);
        altLabel.setEnabled(status);
        altSpinner.setEnabled(status);
        altComboBox.setEnabled(status);
        headingLabel.setEnabled(status);
        headingTF.setEnabled(status);
        headingSlider.setEnabled(status);
        lengthLabel.setEnabled(status);
        lengthSpinner.setEnabled(status);
        lengthComboBox.setEnabled(status);
        widthLabel.setEnabled(status);
        widthSpinner.setEnabled(status);
        widthComboBox.setEnabled(status);
        typeLabel.setEnabled(status);
        typeComboBox.setEnabled(status);
        surfaceLabel.setEnabled(status);
        surfaceComboBox.setEnabled(status);
        closedLabel.setEnabled(status);
        closedComboBox.setEnabled(status);
        transLabel.setEnabled(status);
        transComboBox.setEnabled(status);
    }

    public void updateModel()
    {
        if(model != null)
        {
            try
            {
                altSpinner.commitEdit();
            }
            catch(ParseException pe)
            {
                LogEngine.getInstance().log(pe);
            }
            try
            {
                lengthSpinner.commitEdit();
            }
            catch(ParseException pe)
            {
                LogEngine.getInstance().log(pe);
            }
            try
            {
                widthSpinner.commitEdit();
            }
            catch(ParseException pe)
            {
                LogEngine.getInstance().log(pe);
            }
            model.setAlt(((Double)altSpinner.getValue()).doubleValue());
            model.setAltMeasure((String)altComboBox.getSelectedItem());
            model.setSurface((String)surfaceComboBox.getSelectedItem());
            model.setClosed(closedComboBox.getSelectedIndex() == 0);
            model.setTransparent(transComboBox.getSelectedIndex() == 0);
        }
    }

    private void updateLatitude()
    {
        if(latTF.isPopupDisplayed())
            return;
        double lat = ParseEngine.getInstance().parseLatitude(latTF.getText());
        if(lat == (1.0D / 0.0D))
            lat = model.getLatLon().getLat();
        latTF.setText(DisplayEngine.getInstance().formatObjectLatitude(lat));
        firePropertyChange("update-lat", new Double(model.getLatLon().getLat()), new Double(lat));
        model.setLatLon(new LatLonPoint(lat, model.getLatLon().getLon()));
    }

    private void updateLongitude()
    {
        if(lonTF.isPopupDisplayed())
            return;
        double lon = ParseEngine.getInstance().parseLongitude(lonTF.getText());
        if(lon == (1.0D / 0.0D))
            lon = model.getLatLon().getLon();
        lonTF.setText(DisplayEngine.getInstance().formatObjectLongitude(lon));
        firePropertyChange("update-lon", new Double(model.getLatLon().getLon()), new Double(lon));
        model.setLatLon(new LatLonPoint(model.getLatLon().getLat(), lon));
    }

    private void updateType()
    {
        firePropertyChange("update-type", model.getType(), (String)typeComboBox.getSelectedItem());
        model.setType((String)typeComboBox.getSelectedItem());
    }

    private void updateLengthMeasure()
    {
        if(((String)lengthComboBox.getSelectedItem()).equals(model.getLengthMeasure()))
            return;
        if(SettingsEngine.getInstance().getAdjustMeasurements())
        {
            if(model.getLengthMeasure().equals("M"))
                model.setLength(model.getLength() * 3.28F);
            else
                model.setLength(model.getLength() / 3.28F);
            lengthSpinner.setValue(new Double(model.getLength()));
        }
        firePropertyChange("update-LengthMeasure", model.getLengthMeasure(), (String)lengthComboBox.getSelectedItem());
        model.setLengthMeasure((String)lengthComboBox.getSelectedItem());
    }

    private void updateWidthMeasure()
    {
        if(((String)widthComboBox.getSelectedItem()).equals(model.getWidthMeasure()))
            return;
        if(SettingsEngine.getInstance().getAdjustMeasurements())
        {
            if(model.getWidthMeasure().equals("M"))
                model.setWidth(model.getWidth() * 3.28F);
            else
                model.setWidth(model.getWidth() / 3.28F);
            widthSpinner.setValue(new Double(model.getWidth()));
        }
        firePropertyChange("update-widthMeasure", model.getWidthMeasure(), (String)widthComboBox.getSelectedItem());
        model.setWidthMeasure((String)widthComboBox.getSelectedItem());
    }

    private void updateHeading()
    {
        if(headingTF.isPopupDisplayed())
            return;
        float heading = model.getHeading();
        try
        {
            heading = Float.parseFloat(headingTF.getText());
        }
        catch(NumberFormatException nfe)
        {
            heading = model.getHeading();
        }
        if(heading < 0.0F)
            heading = 0.0F;
        else
        if(heading > 359F)
            heading = 359F;
        headingSlider.setValue((int)heading);
        headingTF.setText((new StringBuilder()).append("").append(heading).toString());
        firePropertyChange("update-heading", new Float(model.getHeading()), new Float(headingSlider.getValue()));
        model.setHeading(heading);
    }

    private void delete()
    {
        if(JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Helipad?", "Confirm Delete...", 0) != 0)
        {
            return;
        } else
        {
            firePropertyChange("delete", model, model);
            updateDisplay(null);
            return;
        }
    }

    private void updateAltMeasure()
    {
        if(((String)altComboBox.getSelectedItem()).equals(model.getAltMeasure()))
            return;
        if(SettingsEngine.getInstance().getAdjustMeasurements())
        {
            if(model.getAltMeasure().equals("M"))
                model.setAlt(model.getAlt() * 3.2799999713897705D);
            else
                model.setAlt(model.getAlt() / 3.2799999713897705D);
            altSpinner.setValue(new Double(model.getAlt()));
        }
        model.setAltMeasure((String)altComboBox.getSelectedItem());
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        if(!listeners.contains(listener))
            listeners.add(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
        listeners.remove(listener);
    }

    public void firePropertyChange(String propertyName, Object oldValue, Object newValue)
    {
        super.firePropertyChange(propertyName, oldValue, newValue);
        if(listeners == null)
            return;
        Vector list;
        synchronized(this)
        {
            list = (Vector)listeners.clone();
        }
        if(list.size() == 0)
            return;
        PropertyChangeEvent event = new PropertyChangeEvent(this, propertyName, oldValue, newValue);
        for(int i = list.size() - 1; i >= 0; i--)
            ((PropertyChangeListener)list.elementAt(i)).propertyChange(event);

    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == latTF)
            updateLatitude();
        else
        if(event.getSource() == lonTF)
            updateLongitude();
        else
        if(event.getSource() == typeComboBox && model != null)
            updateType();
        else
        if(event.getSource() == lengthComboBox && model != null)
            updateLengthMeasure();
        else
        if(event.getSource() == widthComboBox && model != null)
            updateWidthMeasure();
        else
        if(event.getSource() == headingTF)
            updateHeading();
        else
        if(event.getSource() == deleteButton)
            delete();
        else
        if(event.getSource() == lockingButton)
            LockingEngine.getInstance().setHelipadsLocked(!LockingEngine.getInstance().getHelipadsLocked());
        else
        if(event.getSource() == altComboBox)
            updateAltMeasure();
        else
        if(event.getSource() == surfaceComboBox)
        {
            firePropertyChange("update-surface", model.getSurface(), (String)surfaceComboBox.getSelectedItem());
            model.setSurface((String)surfaceComboBox.getSelectedItem());
        } else
        if(event.getSource() == closedComboBox)
        {
            firePropertyChange("update-closed", new Boolean(model.getClosed()), new Boolean(closedComboBox.getSelectedIndex() == 0));
            model.setClosed(closedComboBox.getSelectedIndex() == 0);
        } else
        if(event.getSource() == transComboBox)
        {
            firePropertyChange("update-transparent", new Boolean(model.getTransparent()), new Boolean(transComboBox.getSelectedIndex() == 0));
            model.setTransparent(transComboBox.getSelectedIndex() == 0);
        }
    }

    public void stateChanged(ChangeEvent event)
    {
        if(event.getSource() == headingSlider && model != null)
        {
            headingTF.setText((new StringBuilder()).append("").append(headingSlider.getValue()).toString());
            firePropertyChange("update-heading", new Float(model.getHeading()), new Float(headingSlider.getValue()));
            model.setHeading(headingSlider.getValue());
        } else
        if(event.getSource() == lengthSpinner && model != null)
        {
            firePropertyChange("update-length", new Double(model.getLength()), (Double)lengthSpinner.getValue());
            model.setLength(((Double)lengthSpinner.getValue()).floatValue());
        } else
        if(event.getSource() == widthSpinner && model != null)
        {
            firePropertyChange("update-width", new Double(model.getWidth()), (Double)widthSpinner.getValue());
            model.setWidth(((Double)widthSpinner.getValue()).floatValue());
        } else
        if(event.getSource() == altSpinner && model != null)
            model.setAlt(((Double)altSpinner.getValue()).doubleValue());
    }

    public void focusGained(FocusEvent focusevent)
    {
    }

    public void focusLost(FocusEvent event)
    {
        if(event.getSource() == latTF)
            updateLatitude();
        else
        if(event.getSource() == lonTF)
            updateLongitude();
        else
        if(event.getSource() == headingTF)
            updateHeading();
    }

    public void propertyChange(PropertyChangeEvent event)
    {
        if(event.getSource() == model)
        {
            if(event.getPropertyName().equals("latLon"))
            {
                latTF.setText(DisplayEngine.getInstance().formatObjectLatitude(((LatLonPoint)event.getNewValue()).getLat()));
                lonTF.setText(DisplayEngine.getInstance().formatObjectLongitude(((LatLonPoint)event.getNewValue()).getLon()));
            } else
            if(event.getPropertyName().equals("alt"))
            {
                altSpinner.removeChangeListener(this);
                altSpinner.setValue(event.getNewValue());
                altSpinner.addChangeListener(this);
            } else
            if(event.getPropertyName().equals("altMeasure"))
                altComboBox.setSelectedItem(event.getNewValue());
            else
            if(event.getPropertyName().equals("heading"))
            {
                headingTF.setText((new StringBuilder()).append("").append(((Float)event.getNewValue()).floatValue()).toString());
                headingSlider.removeChangeListener(this);
                headingSlider.setValue(((Float)event.getNewValue()).intValue());
                headingSlider.addChangeListener(this);
            } else
            if(event.getPropertyName().equals("length"))
            {
                lengthSpinner.removeChangeListener(this);
                lengthSpinner.setValue(new Double(((Float)event.getNewValue()).doubleValue()));
                lengthSpinner.addChangeListener(this);
            } else
            if(event.getPropertyName().equals("width"))
            {
                widthSpinner.removeChangeListener(this);
                widthSpinner.setValue(new Double(((Float)event.getNewValue()).doubleValue()));
                widthSpinner.addChangeListener(this);
            } else
            if(event.getPropertyName().equals("lengthMeasure"))
                lengthComboBox.setSelectedItem((String)event.getNewValue());
            else
            if(event.getPropertyName().equals("widthMeasure"))
                widthComboBox.setSelectedItem((String)event.getNewValue());
            else
            if(event.getPropertyName().equals("type"))
            {
                typeComboBox.removeActionListener(this);
                typeComboBox.setSelectedItem((String)event.getNewValue());
                typeComboBox.addActionListener(this);
            } else
            if(event.getPropertyName().equals("surface"))
            {
                surfaceComboBox.removeActionListener(this);
                surfaceComboBox.setSelectedItem(event.getNewValue());
                surfaceComboBox.addActionListener(this);
            } else
            if(event.getPropertyName().equals("closed"))
            {
                closedComboBox.removeActionListener(this);
                closedComboBox.setSelectedIndex(((Boolean)event.getNewValue()).booleanValue() ? 0 : 1);
                closedComboBox.addActionListener(this);
            } else
            if(event.getPropertyName().equals("transparent"))
            {
                transComboBox.removeActionListener(this);
                transComboBox.setSelectedIndex(((Boolean)event.getNewValue()).booleanValue() ? 0 : 1);
                transComboBox.addActionListener(this);
            }
        } else
        if((event.getSource() instanceof LockingEngine) && event.getPropertyName().equals("helipadsLocked"))
        {
            latTF.setBackground(((Boolean)event.getNewValue()).booleanValue() ? Color.red : Color.white);
            lonTF.setBackground(((Boolean)event.getNewValue()).booleanValue() ? Color.red : Color.white);
            if(((Boolean)event.getNewValue()).booleanValue())
                lockingButton.setIcon(IconFactory.getInstance().getIcon("padlockLocked"));
            else
                lockingButton.setIcon(IconFactory.getInstance().getIcon("padlockUnlocked"));
        }
    }

    private HelipadModel model;
    private Vector listeners;
    private JButton lockingButton;
    private JButton deleteButton;
    private PopupTextField latTF;
    private PopupTextField lonTF;
    private JSpinner altSpinner;
    private JComboBox altComboBox;
    private PopupTextField headingTF;
    private JSlider headingSlider;
    private JSpinner lengthSpinner;
    private JComboBox lengthComboBox;
    private JSpinner widthSpinner;
    private JComboBox widthComboBox;
    private JComboBox surfaceComboBox;
    private JComboBox typeComboBox;
    private JComboBox closedComboBox;
    private JComboBox transComboBox;
    private JLabel latLabel;
    private JLabel lonLabel;
    private JLabel altLabel;
    private JLabel headingLabel;
    private JLabel lengthLabel;
    private JLabel widthLabel;
    private JLabel surfaceLabel;
    private JLabel typeLabel;
    private JLabel closedLabel;
    private JLabel transLabel;
}
