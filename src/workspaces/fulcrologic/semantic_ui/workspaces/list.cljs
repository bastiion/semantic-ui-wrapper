(ns fulcrologic.semantic-ui.workspaces.list
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [com.fulcrologic.semantic-ui.elements.list.ui-list :refer [ui-list]]
            [com.fulcrologic.semantic-ui.elements.list.ui-list-content :refer [ui-list-content]]
            [com.fulcrologic.semantic-ui.elements.list.ui-list-list :refer [ui-list-list]]
            [com.fulcrologic.semantic-ui.elements.list.ui-list-item :refer [ui-list-item]]
            [com.fulcrologic.semantic-ui.elements.list.ui-list-header :refer [ui-list-header]]
            [com.fulcrologic.semantic-ui.elements.list.ui-list-description :refer [ui-list-description]]
            [com.fulcrologic.semantic-ui.elements.icon.ui-icon :refer [ui-icon]]
            [com.fulcrologic.semantic-ui.icons :as i]))

(comp/defsc SemanticList
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}

  (dom/div {}
           (ui-list
             (ui-list-item)
             )
           ))

(ws/defcard semantic-list
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? false
     ::ct.fulcro/root SemanticList}))

