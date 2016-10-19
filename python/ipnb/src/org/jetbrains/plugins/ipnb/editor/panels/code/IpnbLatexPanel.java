package org.jetbrains.plugins.ipnb.editor.panels.code;

import com.intellij.openapi.ui.VerticalFlowLayout;
import com.intellij.openapi.util.text.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.plugins.ipnb.IpnbUtils;
import org.jetbrains.plugins.ipnb.editor.IpnbEditorUtil;
import org.jetbrains.plugins.ipnb.editor.panels.IpnbFilePanel;
import org.jetbrains.plugins.ipnb.format.cells.output.IpnbLatexOutputCell;

import javax.swing.*;
import java.awt.event.MouseAdapter;

public class IpnbLatexPanel extends IpnbCodeOutputPanel<IpnbLatexOutputCell> {

  public IpnbLatexPanel(@NotNull final IpnbLatexOutputCell cell, @NotNull final IpnbFilePanel parent, 
                        @Nullable MouseAdapter hideOutputListener) {
    super(cell, parent, hideOutputListener);
    setLayout(new VerticalFlowLayout(VerticalFlowLayout.TOP));
    setBackground(IpnbEditorUtil.getBackground());
  }

  @Override
  protected JComponent createViewPanel() {
    final int width = myParent.getWidth();
    return IpnbUtils.createLatexPane(StringUtil.join(myCell.getLatex(), ""), width);
  }
}
