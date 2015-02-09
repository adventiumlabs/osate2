package org.osate.assure.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.osate.assure.assure.AssumptionResult;
import org.osate.assure.assure.CaseResult;
import org.osate.assure.assure.ClaimResult;
import org.osate.assure.assure.PreconditionResult;
import org.osate.assure.assure.ResultIssue;
import org.osate.assure.assure.VerificationActivityResult;

@SuppressWarnings("all")
public class AssureEObjectHoverProvider extends DefaultEObjectHoverProvider {
  public String getHoverInfoAsHtml(final EObject o) {
    boolean _matched = false;
    if (!_matched) {
      if (o instanceof CaseResult) {
        _matched=true;
        String _elvis = null;
        String _message = ((CaseResult)o).getMessage();
        if (_message != null) {
          _elvis = _message;
        } else {
          _elvis = "No message";
        }
        return _elvis;
      }
    }
    if (!_matched) {
      if (o instanceof ClaimResult) {
        _matched=true;
        String _elvis = null;
        String _message = ((ClaimResult)o).getMessage();
        if (_message != null) {
          _elvis = _message;
        } else {
          _elvis = "No message";
        }
        return _elvis;
      }
    }
    if (!_matched) {
      if (o instanceof VerificationActivityResult) {
        _matched=true;
        String _elvis = null;
        String _message = ((VerificationActivityResult)o).getMessage();
        if (_message != null) {
          _elvis = _message;
        } else {
          _elvis = "No message";
        }
        return _elvis;
      }
    }
    if (!_matched) {
      if (o instanceof AssumptionResult) {
        _matched=true;
        String _elvis = null;
        String _message = ((AssumptionResult)o).getMessage();
        if (_message != null) {
          _elvis = _message;
        } else {
          _elvis = "No message";
        }
        return _elvis;
      }
    }
    if (!_matched) {
      if (o instanceof PreconditionResult) {
        _matched=true;
        String _elvis = null;
        String _message = ((PreconditionResult)o).getMessage();
        if (_message != null) {
          _elvis = _message;
        } else {
          _elvis = "No message";
        }
        return _elvis;
      }
    }
    if (!_matched) {
      if (o instanceof ResultIssue) {
        _matched=true;
        String _elvis = null;
        String _message = ((ResultIssue)o).getMessage();
        if (_message != null) {
          _elvis = _message;
        } else {
          _elvis = "No message";
        }
        return _elvis;
      }
    }
    return "No message!!";
  }
}