(ns fulcrologic.semantic-ui.workspaces.x
  (:require [com.fulcrologic.fulcro.components :as fp]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.mutations :as fm]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [com.fulcrologic.semantic-ui.factory-helpers :as h]
            [com.fulcrologic.semantic-ui.elements.list.ui-list :refer [ui-list]]
            [com.fulcrologic.semantic-ui.elements.list.ui-list-item :refer [ui-list-item]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
            ["semantic-ui-react/dist/commonjs/elements/List/List" :default List]
            ["semantic-ui-react/dist/commonjs/elements/List/ListItem" :default ListItem]))

(def ui-io-list (interop/react-factory List))
(def ui-io-list-item (interop/react-factory ListItem))

(fp/defsc X
  [this {:keys [my-val]}]
  {:initial-state (fn [_] {:my-val ""})
   :ident         (fn [] [::id "singleton"])
   :query         [:my-val]}
  (dom/div
    (ui-io-list {}
      (ui-io-list-item {} "Hallo")
      (ui-io-list-item {} "semantic-ui-react"))
    (ui-list {}
      (ui-list-item {} "Hallo")
      (ui-list-item {} "com.fulcrologic.semantic-ui"))))

(ws/defcard x
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? false
     ::ct.fulcro/root X}))
